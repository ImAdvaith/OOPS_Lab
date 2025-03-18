class Device {
    String brand;
    String model;

    public Device(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public void displayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
    }
}

class Light extends Device {
    public Light(String brand, String model) {
        super(brand, model);
    }

    public void turnOn() {
        System.out.println("Turning on the light.");
    }

    public void turnOff() {
        System.out.println("Turning off the light.");
    }
}

class Appliance extends Device {
    public Appliance(String brand, String model) {
        super(brand, model);
    }

    public void powerOn() {
        System.out.println("Powering on the appliance.");
    }

    public void powerOff() {
        System.out.println("Powering off the appliance.");
    }
}

class SmartLight extends Light {
    public SmartLight(String brand, String model) {
        super(brand, model);
    }

    public void controlWithApp() {
        System.out.println("Controlling the smart light with the app.");
    }
}

class SmartAppliance extends Appliance {
    public SmartAppliance(String brand, String model) {
        super(brand, model);
    }

    public void controlWithApp() {
        System.out.println("Controlling the smart appliance with the app.");
    }
}

public class SmartHomeSystem {
    public static void main(String[] args) {
        SmartLight smartLight = new SmartLight("Philips", "Hue");
        SmartAppliance smartAppliance = new SmartAppliance("Samsung", "Fridge");

        System.out.println("\nSmart Light:");
        smartLight.displayInfo();
        smartLight.turnOn();
        smartLight.controlWithApp();

        System.out.println("\nSmart Appliance:");
        smartAppliance.displayInfo();
        smartAppliance.powerOn();
        smartAppliance.controlWithApp();
    }
}
