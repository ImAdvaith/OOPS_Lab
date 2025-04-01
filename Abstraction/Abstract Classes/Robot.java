abstract class WarehouseRobot {
    protected String robotID;
    protected boolean isActive;

    public WarehouseRobot(String robotID) {
        this.robotID = robotID;
        this.isActive = false;
    }

    public abstract void startTask();
    public abstract void completeTask();
}

class PickingRobot extends WarehouseRobot {
    public PickingRobot(String robotID) {
        super(robotID);
    }

    @Override
    public void startTask() {
        isActive = true;
        System.out.println(robotID + " started picking items.");
    }

    @Override
    public void completeTask() {
        isActive = false;
        System.out.println(robotID + " completed picking.");
    }
}

public class WarehouseSystem {
    public static void main(String[] args) {
        PickingRobot pickBot = new PickingRobot("PICK-101");
        pickBot.startTask();
        pickBot.completeTask();
    }
}
