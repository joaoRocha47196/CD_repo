package workerapp.spread;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;
import spread.*;
import workerapp.gluster.GlusterFileManager;

import java.io.IOException;
import java.util.concurrent.TimeoutException;

import static workerapp.Worker.sendNotification;

public class SpreadMessageListener implements BasicMessageListener {
    private SpreadConnection connection;
    private boolean isLeader = false;
    private int id = -1;
    private String exchangeName;
    private String type;
    private String fileName;

    private static final String SPREAD_GROUP_NAME = "SalesWorkers";


    public SpreadMessageListener(SpreadConnection connection) {
        this.connection = connection;
    }

    @Override
    public void messageReceived(SpreadMessage spreadMessage) {
        try {
            System.out.println("Received message from Spread Group: " + spreadMessage.getSender());
            if (spreadMessage.isRegular()) {
                Object retrievedObject = spreadMessage.getObject();

                // Resume Multicast Message
                if (retrievedObject instanceof ResumoInfo) {
                    System.out.println("ResumeInfo message from SpreadGroup Received");
                    // TODO somehow stop all the workers
                    processResumeMessage(spreadMessage, (ResumoInfo) retrievedObject);

                    // Election Multicast Message
                } else if (retrievedObject instanceof ElectionInfo)
                    processElectionMessage(spreadMessage, (ElectionInfo) retrievedObject);

                // Merge All Files
                if (isLeader) {
                    GlusterFileManager.mergeFilesByRoutingKey(this.type, this.fileName);
                    sendNotification(this.exchangeName, this.fileName);
                }
            }
        } catch (SpreadException e) {
            System.out.println("Error receiving message from Spread Group: " + e.getMessage());
            e.printStackTrace();
        }
    }


    private void processResumeMessage(SpreadMessage spreadMessage, ResumoInfo retrievedObject) {
        MembershipInfo info = spreadMessage.getMembershipInfo();
        // TODO do smt?
        this.exchangeName = retrievedObject.getExchangeName();
        this.type = retrievedObject.getProductType();
        this.fileName = retrievedObject.getFileName();

        if (info.isSelfLeave()) {
            System.out.println("Left group:"+info.getGroup().toString());
        } else {
            SpreadGroup[] members = info.getMembers();
            findMemberWithHighestId(members);
            sendElectionMessage();
        }
    }

    private void findMemberWithHighestId(SpreadGroup[] members){
        for (SpreadGroup member : members) {
            int currentID = Integer.parseInt(member.toString());
            if (currentID > this.id)
                this.id = currentID;
        }
    }

    public void sendElectionMessage() {
        try {
            SpreadMessage spreadMessage = new SpreadMessage();
            spreadMessage.setSafe();
            spreadMessage.addGroup(SPREAD_GROUP_NAME);
            spreadMessage.setObject(new ElectionInfo(this.id));
            sendMulticast(spreadMessage);
        } catch (SpreadException e) {
            System.err.println("Error sending multicast message to Spread Group: " + e.getMessage());
        }
    }

    private void processElectionMessage(SpreadMessage spreadMessage, ElectionInfo retrievedObject) {
        MembershipInfo info = spreadMessage.getMembershipInfo();
        int receivedLeaderId = retrievedObject.getId();
        System.out.println("inside processElectionMessage");

        if (info.isSelfLeave()) {
            // TODO, do smt?
            System.out.println("Left group:"+info.getGroup().toString());
        } else {
            if (receivedLeaderId == this.id) {
                isLeader = true;
                System.out.println("Este worker é o líder.");
            } else {
                isLeader = false;
                System.out.println("Este worker não é o líder.");
            }
        }
    }

    public void sendMulticast(SpreadMessage message) throws SpreadException {
        if (connection.isConnected()) {
            connection.multicast(message);
        } else {
            System.err.println("Not connected to Spread group");
        }
    }
}
