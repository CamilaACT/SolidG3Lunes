package ocp;

public class Main {
        public static void main(String[] args) {
            NotificationService service = new NotificationService();

            service.sendNotification(new EmailNotifier(), "Hello via Email!");
            service.sendNotification(new SMSNotifier(), "Hello via SMS!");
            service.sendNotification(new PushNotifier(), "Hello via Push Notification!");

            
        }
    }
