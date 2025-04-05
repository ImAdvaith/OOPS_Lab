import java.util.*;

class OverbookingException extends Exception {
    public OverbookingException(String message) {
        super(message);
    }
}

class Train {
    String name;
    int capacity;
    int booked;

    public Train(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
        this.booked = 0;
    }

    public void bookSeat(int seats) throws OverbookingException {
        if (booked + seats > capacity) {
            throw new OverbookingException("Only " + (capacity - booked) + " seats left on " + name);
        }
        booked += seats;
        System.out.println("✅ Successfully booked " + seats + " seats on " + name);
    }
}

public class TrainReservation {
    public static void main(String[] args) {
        Train train = new Train("Kaveri Express", 5);
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter number of seats to book: ");
            int seats = sc.nextInt();
            if (seats <= 0) throw new IllegalArgumentException("Seats must be positive.");
            train.bookSeat(seats);
        } catch (OverbookingException | IllegalArgumentException e) {
            System.out.println("❌ " + e.getMessage());
        }
    }
}
