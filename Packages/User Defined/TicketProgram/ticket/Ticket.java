package ticket;

public class Ticket {
    private String ticketID;
    private String customerName;
    private String eventName;

    public Ticket(String ticketID, String customerName, String eventName) {
        this.ticketID = ticketID;
        this.customerName = customerName;
        this.eventName = eventName;
    }

    public void displayTicket() {
        System.out.println("Ticket ID: " + ticketID);
        System.out.println(" Name: " + customerName);
        System.out.println(" Event: " + eventName);
    }
}
