package workerapp;

import com.rabbitmq.client.*;
import workerapp.gluster.GlusterFileManager;
import java.nio.charset.StandardCharsets;

public class WorkerCallback implements DeliverCallback {

    private static final String GLUSTER_DIRECTORY_PATH = "/var/sharedfiles";
    private final String queueName;
    private final String workerName;

    public WorkerCallback(String queueName, String workerName) {
        this.queueName = queueName;
        this.workerName = workerName;
    }

    @Override
    public void handle(String consumerTag, Delivery delivery) {
        String message = new String(delivery.getBody(), StandardCharsets.UTF_8);
        String routingKey = delivery.getEnvelope().getRoutingKey();

        System.out.println("Message Received with routing key:" + routingKey);
        System.out.println("Received Message: '" + message + "'");
        GlusterFileManager.writeToFile(message, routingKey, workerName);
    }


}

