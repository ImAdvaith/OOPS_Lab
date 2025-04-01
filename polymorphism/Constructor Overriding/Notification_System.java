abstract class Notification {
    protected String sender;
    
    public Notification(String sender) {
        this.sender = sender;
    }
    
    public abstract void send(String message);
}

class EmailNotification extends Notification {
    private String emailAddress;
    
    public EmailNotification(String sender, String emailAddress) {
        super(sender);
        this.emailAddress = emailAddress;
    }
    
    @Override
    public void send(String message) {
        System.out.println("Sending email from " + sender + " to " + emailAddress + " with message: " + message);
    }
}

class SMSNotification extends Notification {
    private String phoneNumber;
    
    public SMSNotification(String sender, String phoneNumber) {
        super(sender);
        this.phoneNumber = phoneNumber;
    }
    
    @Override
    public void send(String message) {
        System.out.println("Sending SMS from " + sender + " to " + phoneNumber + " with message: " + message);
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
        manager.notifyUser(new EmailNotification("Admin", "user@gmail.com"), "Hello via Email");
        manager.notifyUser(new SMSNotification("Support", "123-456-7890"), "Hello via SMS");
    }
}
