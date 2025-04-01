
interface Device {
    void turnOn();
    void turnOff();
    void performTask();
}

class Printer implements Device {
    @Override
    public void turnOn() {
        System.out.println("Printer is now ON.");
    }

    @Override
    public void turnOff() {
        System.out.println("Printer is now OFF.");
    }

    @Override
    public void performTask() {
        System.out.println("Printing document...");
    }
}

class Scanner implements Device {
    @Override
    public void turnOn() {
        System.out.println("Scanner is now ON.");
    }

    @Override
    public void turnOff() {
        System.out.println("Scanner is now OFF.");
    }

    @Override
    public void performTask() {
        System.out.println("Scanning document...");
    }
}

public class DeviceManager {
    public static void main(String[] args) {
        Device printer = new Printer();
        printer.turnOn();
        printer.performTask();
        printer.turnOff();

        Device scanner = new Scanner();
        scanner.turnOn();
        scanner.performTask();
        scanner.turnOff();
    }
}
