package ticket;

public class Ticket {
    private String customerName;
    private String destination;
    private int seatNumber;

    public Ticket(String customerName, String destination, int seatNumber) {
        this.customerName = customerName;
        this.destination = destination;
        this.seatNumber = seatNumber;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getDestination() {
        return destination;
    }

    public int getSeatNumber() {
        return seatNumber;
    }

    @Override
    public String toString() {
        return "Ticket for " + customerName + " to " + destination + " | Seat: " + seatNumber;
    }

    public String toCSV() {
        return customerName + "," + destination + "," + seatNumber;
    }
}
