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

public class Main {
    public static void main(String[] args) {
        Notification notification;
        notification = new EmailNotification();
        notification.send("Hello via Email");
        notification = new SMSNotification();
        notification.send("Hello via SMS");
    }
}
