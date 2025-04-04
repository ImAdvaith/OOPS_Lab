abstract class ConservationDrone {
    String name;
    String mission;

    ConservationDrone(String name, String mission) {
        this.name = name;
        this.mission = mission;
    }

    abstract void performMission();

    void displayInfo() {
        System.out.println("Drone Name: " + name);
        System.out.println("Mission: " + mission);
    }
}


class WildlifeTrackingDrone extends ConservationDrone {
    String animalType;

    WildlifeTrackingDrone(String name, String mission, String animalType) {
        super(name, mission);
        this.animalType = animalType;
    }

    @Override
    void performMission() {
        System.out.println(name + " is tracking the movement of " + animalType + ".");
    }

    void monitorEndangeredSpecies() {
        System.out.println(name + " is monitoring endangered species of " + animalType + ".");
    }
}

class PollutionControlDrone extends ConservationDrone {
    String pollutionType;

    PollutionControlDrone(String name, String mission, String pollutionType) {
        super(name, mission);
        this.pollutionType = pollutionType;
    }

    @Override
    void performMission() {
        System.out.println(name + " is cleaning up " + pollutionType + " pollution.");
    }

    void releaseAntiPollutionAgents() {
        System.out.println(name + " is releasing anti-pollution agents into the environment.");
    }
}

public class EnvironmentalConservation {
    public static void main(String[] args) {
        WildlifeTrackingDrone wildlifeDrone = new WildlifeTrackingDrone("WildTrack 5000", "Wildlife Tracking", "Elephants");
        PollutionControlDrone pollutionDrone = new PollutionControlDrone("PolluClean 3000", "Pollution Control", "Plastic");

        System.out.println("\nWildlife Tracking Drone Details:");
        wildlifeDrone.displayInfo();
        wildlifeDrone.performMission();
        wildlifeDrone.monitorEndangeredSpecies();

        System.out.println("\nPollution Control Drone Details:");
        pollutionDrone.displayInfo();
        pollutionDrone.performMission();
        pollutionDrone.releaseAntiPollutionAgents();
    }
}
