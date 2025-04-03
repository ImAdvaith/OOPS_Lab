// SelfDrivingCar Interface
interface SelfDrivingCar {
    void navigate(String destination);
    void avoidObstacles();
    void analyzeTraffic();
    void adaptToWeather(String weather);
    void manageBattery();
}

// Tesla Autopilot Implementation
class Tesla implements SelfDrivingCar {
    public void navigate(String destination) {
        System.out.println(" Tesla Autopilot: Calculating best route to " + destination + " using AI.");
    }

    public void avoidObstacles() {
        System.out.println(" Tesla Autopilot: Using sensors to avoid pedestrians and vehicles.");
    }

    public void analyzeTraffic() {
        System.out.println(" Tesla Autopilot: Checking traffic density using satellite data.");
    }

    public void adaptToWeather(String weather) {
        if (weather.equals("rainy")) {
            System.out.println(" Tesla: Activating rain mode, reducing speed for safety.");
        } else {
            System.out.println(" Tesla: No special weather adaptation needed.");
        }
    }

    public void manageBattery() {
        System.out.println(" Tesla: Optimizing battery usage for maximum efficiency.");
    }
}

// Waymo Autonomous Car Implementation
class Waymo implements SelfDrivingCar {
    public void navigate(String destination) {
        System.out.println(" Waymo AI: Navigating to " + destination + " using high-resolution maps.");
    }

    public void avoidObstacles() {
        System.out.println(" Waymo AI: Detecting roadblocks and adjusting route.");
    }

    public void analyzeTraffic() {
        System.out.println(" Waymo AI: Scanning real-time traffic conditions.");
    }

    public void adaptToWeather(String weather) {
        System.out.println(" Waymo AI: Adjusting braking and acceleration based on " + weather + " conditions.");
    }

    public void manageBattery() {
        System.out.println(" Waymo AI: Predicting energy consumption for the trip.");
    }
}

// Main Class
public class EnhancedSelfDrivingSystem {
    public static void main(String[] args) {
        SelfDrivingCar tesla = new Tesla();
        SelfDrivingCar waymo = new Waymo();

        tesla.navigate("San Francisco");
        tesla.analyzeTraffic();
        tesla.adaptToWeather("rainy");
        tesla.avoidObstacles();
        tesla.manageBattery();

        waymo.navigate("New York");
        waymo.analyzeTraffic();
        waymo.adaptToWeather("sunny");
        waymo.avoidObstacles();
        waymo.manageBattery();
    }
}
