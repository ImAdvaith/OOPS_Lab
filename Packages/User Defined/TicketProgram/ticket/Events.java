package ticket;

public class Event {
    private String eventName;
    private String eventDate;
    private int availableSeats;

    public Event(String eventName, String eventDate, int availableSeats) {
        this.eventName = eventName;
        this.eventDate = eventDate;
        this.availableSeats = availableSeats;
    }

    public String getEventName() {
        return eventName;
    }

    public String getEventDate() {
        return eventDate;
    }

    public int getAvailableSeats() {
        return availableSeats;
    }

    public boolean bookSeat() {
        if (availableSeats > 0) {
            availableSeats--;
            return true;
        }
        return false;
    }

    public void displayEventDetails() {
        System.out.println("Event: " + eventName);
        System.out.println("Date: " + eventDate);
        System.out.println("Seats Available: " + availableSeats);
    }
}
