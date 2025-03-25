abstract class Notification {
    public abstract void send(String message);
}

class EmailNotification extends Notification {
    @Override
    public void send(String message) {
        System.out.println("Sending email with message: " + message);
    }
}

class SMSNotification extends Notification {
    @Override
    public void send(String message) {
        System.out.println("Sending SMS with message: " + message);
    }
}

class NotificationManager {
    public void notifyUser(Notification notification, String message) {
        notification.send(message);
    }
}

public class Main {
    public static void main(String[] args) {
        NotificationManager manager = new NotificationManager();
        manager.notifyUser(new EmailNotification(), "Hello via Email");
        manager.notifyUser(new SMSNotification(), "Hello via SMS");
    }
}
