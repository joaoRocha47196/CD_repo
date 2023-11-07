package clientapp.StreamObservers;

import io.grpc.stub.StreamObserver;

public class RegisterServer implements StreamObserver<EmptyResponse> {
    @Override
    public void onNext(EmptyResponse emptyResponse) {
        System.out.println("╔════════════════════════════════════╗");
        System.out.println("║    Server Registration Response    ║");
        System.out.println("║------------------------------------║");
        System.out.println("║ Server registered successfully.    ║");
        System.out.println("║------------------------------------║");
        System.out.println("╚════════════════════════════════════╝");
    }

    @Override
    public void onError(Throwable t) {
        System.err.println("Error: " + t.getMessage());
    }

    @Override
    public void onCompleted() {
        System.out.println("Server registration completed.");
    }
}
