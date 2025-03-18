class Vehicle {
    String make;
    String model;

    public Vehicle(String make, String model) {
        this.make = make;
        this.model = model;
    }

    public void startEngine() {
        System.out.println("Engine started for " + make + " " + model);
    }

    public void displayInfo() {
        System.out.println("Vehicle Make: " + make);
        System.out.println("Vehicle Model: " + model);
    }
}

class Car extends Vehicle {
    int doors;

    public Car(String make, String model, int doors) {
        super(make, model);
        this.doors = doors;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Number of Doors: " + doors);
    }

    public void honk() {
        System.out.println("Car horn: Beep beep!");
    }
}

class ElectricCar extends Car {
    int batteryCapacity;

    public ElectricCar(String make, String model, int doors, int batteryCapacity) {
        super(make, model, doors);
        this.batteryCapacity = batteryCapacity;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Battery Capacity: " + batteryCapacity + " kWh");
    }

    public void chargeBattery() {
        System.out.println("Charging battery... " + batteryCapacity + " kWh capacity.");
    }
}

public class VehicleManagement {
    public static void main(String[] args) {
        ElectricCar tesla = new ElectricCar("Tesla", "Model S", 4, 100);
        tesla.startEngine();
        tesla.displayInfo();
        tesla.chargeBattery();
    }
}
