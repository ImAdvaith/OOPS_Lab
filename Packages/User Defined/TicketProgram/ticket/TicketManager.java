package ticket;

import java.util.ArrayList;
import java.io.*;

public class TicketManager {
    private ArrayList<Ticket> ticketList;
    private static final String FILE_NAME = "tickets.txt";

    public TicketManager() {
        ticketList = new ArrayList<>();
    }

    public void bookTicket(String name, String destination, int seatNumber) {
        Ticket ticket = new Ticket(name, destination, seatNumber);
        ticketList.add(ticket);
        saveToFile(ticket);
    }

    public void showAllTickets() {
        System.out.println("\n📋 All Booked Tickets:");
        for (Ticket t : ticketList) {
            System.out.println(t);
        }
    }

    private void saveToFile(Ticket ticket) {
        try (FileWriter fw = new FileWriter(FILE_NAME, true);
             BufferedWriter bw = new BufferedWriter(fw)) {
            bw.write(ticket.toCSV());
            bw.newLine();
        } catch (IOException e) {
            System.out.println("❌ Could not save ticket.");
        }
    }
}
