package ticket;

import java.util.*;

public class TicketManager {
    private ArrayList<Ticket> tickets = new ArrayList<>();
    private HashMap<String, Event> events = new HashMap<>();
    private int ticketCounter = 1;

    public void addEvent(String name, String date, int seats) {
        events.put(name.toLowerCase(), new Event(name, date, seats));
    }

    public void displayAllEvents() {
        System.out.println("\n Available Events:");
        for (Event e : events.values()) {
            e.displayEventDetails();
            System.out.println("---------------");
        }
    }

    public void bookTicket(String customerName, String eventName) {
        if (customerName == null || customerName.trim().isEmpty()) {
            System.out.println(" Invalid name.");
            return;
        }

        Event event = events.get(eventName.toLowerCase());

        if (event == null) {
            System.out.println(" Event not found.");
            return;
        }

        if (!event.bookSeat()) {
            System.out.println(" No seats available for this event.");
            return;
        }

        String ticketID = "TCK" + String.format("%03d", ticketCounter++);
        Ticket t = new Ticket(ticketID, customerName.trim(), event.getEventName());
        tickets.add(t);

        System.out.println("\n Ticket Booked Successfully!");
        t.displayTicket();
    }

    public void displayAllTickets() {
        if (tickets.isEmpty()) {
            System.out.println(" No tickets booked yet.");
            return;
        }

        System.out.println("\n All Tickets:");
        for (Ticket t : tickets) {
            t.displayTicket();
            System.out.println("---------------");
        }
    }
}
