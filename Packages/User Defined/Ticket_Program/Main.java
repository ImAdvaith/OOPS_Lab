import ticket.TicketManager;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        TicketManager manager = new TicketManager();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("\n Enter command (book, show, exit): ");
            String cmd = sc.nextLine();

            if (cmd.equalsIgnoreCase("exit")) {
                System.out.println(" Exiting program...");
                break;
            } else if (cmd.equalsIgnoreCase("book")) {
                System.out.print("Enter name: ");
                String name = sc.nextLine();
                System.out.print("Enter destination: ");
                String destination = sc.nextLine();
                System.out.print(" Enter seat number: ");
                int seat = sc.nextInt();
                sc.nextLine();

                manager.bookTicket(name, destination, seat);
                System.out.println("Ticket booked!");
            } else if (cmd.equalsIgnoreCase("show")) {
                manager.showAllTickets();
            } else {
                System.out.println("Invalid command.");
            }
        }

        sc.close();
    }
}
