import java.util.Random;


abstract class TrafficSystem {
    protected String location;

    TrafficSystem(String location) {
        this.location = location;
    }

    abstract void detectTraffic();
    abstract void controlSignals();
    abstract void allowEmergencyVehicle(String vehicleType);

    public void status() {
        System.out.println(" AI Traffic System activated at: " + location);
    }
}


class AITrafficControl extends TrafficSystem {
    private int trafficDensity; // 0 to 100 (percentage)
    private boolean emergencyVehicleDetected;

    AITrafficControl(String location) {
        super(location);
        this.trafficDensity = new Random().nextInt(101); // Random traffic level
        this.emergencyVehicleDetected = false;
    }

    public void detectTraffic() {
        System.out.println(" Traffic density at " + location + " is: " + trafficDensity + "%");
    }

    public void controlSignals() {
        if (trafficDensity > 80) {
            System.out.println("🔴 Heavy Traffic! Extending red light duration.");
        } else if (trafficDensity > 40) {
            System.out.println("🟡 Moderate Traffic! Balancing signal timings.");
        } else {
            System.out.println("🟢 Light Traffic! Reducing wait time for vehicles.");
        }
    }

    public void allowEmergencyVehicle(String vehicleType) {
        emergencyVehicleDetected = true;
        System.out.println(" Emergency detected: " + vehicleType);
        System.out.println(" Changing all signals to GREEN to allow emergency passage.");
    }
}


public class SmartTrafficSystem {
    public static void main(String[] args) {
        AITrafficControl cityTraffic = new AITrafficControl("Downtown");

        cityTraffic.status();
        cityTraffic.detectTraffic();
        cityTraffic.controlSignals();

       
        cityTraffic.allowEmergencyVehicle("Ambulance");
    }
}
