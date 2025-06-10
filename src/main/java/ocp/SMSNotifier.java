package ocp;

public class SMSNotifier implements Notifier {
    public void send(String message) {
        System.out.println("Sending SMS: " + message);
    }
}
