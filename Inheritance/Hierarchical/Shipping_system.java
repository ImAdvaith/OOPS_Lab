abstract class Shipment {
    String trackingNumber;
    double weight;

    Shipment(String trackingNumber, double weight) {
        this.trackingNumber = trackingNumber;
        this.weight = weight;
    }

    abstract double calculateCost();
    abstract int estimatedDeliveryTime();

    void trackShipment() {
        System.out.println("Tracking Shipment: " + trackingNumber);
    }
}

class AirShipment extends Shipment {
    AirShipment(String trackingNumber, double weight) {
        super(trackingNumber, weight);
    }

    @Override
    double calculateCost() {
        return weight * 5.0;
    }

    @Override
    int estimatedDeliveryTime() {
        return 3;
    }

    void expressShipping() {
        System.out.println("Air shipment expedited for faster delivery.");
    }
}

class SeaShipment extends Shipment {
    SeaShipment(String trackingNumber, double weight) {
        super(trackingNumber, weight);
    }

    @Override
    double calculateCost() {
        return weight * 2.0;
    }

    @Override
    int estimatedDeliveryTime() {
        return 15;
    }

    void oceanFreight() {
        System.out.println("Sea shipment is part of ocean freight.");
    }
}

class GroundShipment extends Shipment {
    GroundShipment(String trackingNumber, double weight) {
        super(trackingNumber, weight);
    }

    @Override
    double calculateCost() {
        return weight * 3.0;
    }

    @Override
    int estimatedDeliveryTime() {
        return 7;
    }

    void deliveryConfirmation() {
        System.out.println("Ground shipment requires delivery confirmation.");
    }
}

public class ShippingSystem {
    public static void main(String[] args) {
        AirShipment air = new AirShipment("A123", 10.0);
        SeaShipment sea = new SeaShipment("S456", 50.0);
        GroundShipment ground = new GroundShipment("G789", 30.0);

        displayShipmentDetails(air);
        displayShipmentDetails(sea);
        displayShipmentDetails(ground);

        System.out.println();

        air.expressShipping();
        sea.oceanFreight();
        ground.deliveryConfirmation();
    }

    static void displayShipmentDetails(Shipment shipment) {
        shipment.trackShipment();
        System.out.println("Cost: $" + shipment.calculateCost());
        System.out.println("Estimated Delivery Time: " + shipment.estimatedDeliveryTime() + " days");
    }
}
