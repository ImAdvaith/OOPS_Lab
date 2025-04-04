import ticket.TicketManager;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        TicketManager manager = new TicketManager();
        Scanner sc = new Scanner(System.in);

        // Add sample events
        manager.addEvent("Concert Night", "2025-04-15", 5);
        manager.addEvent("Comedy Fest", "2025-04-20", 3);
        manager.addEvent("Tech Conference", "2025-05-01", 4);

        System.out.println("🎉 Welcome to the Event Ticket Booking System!");

        while (true) {
            System.out.println("\n1. View Events\n2. Book Ticket\n3. View Booked Tickets\n4. Exit");
            System.out.print("Choose an option: ");
            int choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1:
                    manager.displayAllEvents();
                    break;
                case 2:
                    System.out.print("Enter your name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter event name: ");
                    String event = sc.nextLine();
                    manager.bookTicket(name, event);
                    break;
                case 3:
                    manager.displayAllTickets();
                    break;
                case 4:
                    System.out.println("👋 Thank you for using the system!");
                    sc.close();
                    return;
                default:
                    System.out.println("❗ Invalid option.");
            }
        }
    }
}
