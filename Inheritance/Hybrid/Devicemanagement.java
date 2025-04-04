interface Connectivity {
    void connectToNetwork();
    void disconnectFromNetwork();
}

interface Power {
    void turnOn();
    void turnOff();
}

class Device {
    String deviceName;

    Device(String deviceName) {
        this.deviceName = deviceName;
    }

    void displayDeviceInfo() {
        System.out.println("Device Name: " + deviceName);
    }
}

class SmartPhone extends Device implements Connectivity, Power {
    SmartPhone(String deviceName) {
        super(deviceName);
    }

    @Override
    public void connectToNetwork() {
        System.out.println("SmartPhone connected to Wi-Fi.");
    }

    @Override
    public void disconnectFromNetwork() {
        System.out.println("SmartPhone disconnected from Wi-Fi.");
    }

    @Override
    public void turnOn() {
        System.out.println("SmartPhone powered on.");
    }

    @Override
    public void turnOff() {
        System.out.println("SmartPhone powered off.");
    }

    void deviceDetails() {
        displayDeviceInfo();
        connectToNetwork();
        turnOn();
    }
}

public class HybridInheritance {
    public static void main(String[] args) {
        SmartPhone phone = new SmartPhone("iPhone");
        phone.deviceDetails();
        phone.disconnectFromNetwork();
        phone.turnOff();
    }
}
