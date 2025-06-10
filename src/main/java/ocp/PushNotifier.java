package ocp;

public class PushNotifier implements Notifier {
    public void send(String message) {
        System.out.println("Sending Push Notification: " + message);
    }
}
