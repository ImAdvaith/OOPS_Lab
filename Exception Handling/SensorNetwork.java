import java.util.*;

class FaultySensorException extends Exception {
    public FaultySensorException(String message) {
        super(message);
    }
}

class Sensor {
    private String id;
    private Random random;

    public Sensor(String id) {
        this.id = id;
        this.random = new Random();
    }

    public double getReading() throws FaultySensorException {
        double temperature = -60 + (160 * random.nextDouble()); 
        if (temperature < -50 || temperature > 100) {
            throw new FaultySensorException("Faulty data from Sensor " + id + ": " + temperature + "°C");
        }
        return temperature;
    }

    public String getId() {
        return id;
    }
}

public class SensorNetwork {
    public static void main(String[] args) {
        List<Sensor> sensors = new ArrayList<>();
        sensors.add(new Sensor("S1"));
        sensors.add(new Sensor("S2"));
        sensors.add(new Sensor("S3"));
        sensors.add(new Sensor("S4"));

        System.out.println("🌡Starting Sensor Network Monitoring...\n");

        for (Sensor sensor : sensors) {
            try {
                double temp = sensor.getReading();
                System.out.printf("Sensor %s reports: %.2f°C\n", sensor.getId(), temp);
            } catch (FaultySensorException e) {
                System.out.println(e.getMessage());
            }
        }

        System.out.println("\n Monitoring complete.");
    }
}
