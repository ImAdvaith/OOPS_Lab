import java.util.HashSet;
import java.util.Scanner;

class ParkingFullException extends Exception {
    public ParkingFullException(String msg) {
        super(msg);
    }
}

class DuplicateEntryException extends Exception {
    public DuplicateEntryException(String msg) {
        super(msg);
    }
}

public class ParkingLot {
    public static void main(String[] args) {
        HashSet<String> parkedVehicles = new HashSet<>();
        final int MAX_CAPACITY = 3;
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            try {
                System.out.print("Enter vehicle number: ");
                String vehicle = sc.nextLine();

                if (parkedVehicles.size() >= MAX_CAPACITY) {
                    throw new ParkingFullException("Parking lot full!");
                }

                if (!parkedVehicles.add(vehicle)) {
                    throw new DuplicateEntryException("Vehicle already parked.");
                }

                System.out.println("✅ Vehicle " + vehicle + " parked.");
            } catch (ParkingFullException | DuplicateEntryException e) {
                System.out.println("❌ " + e.getMessage());
            }
        }
    }
}
