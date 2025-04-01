abstract class SmartWatch {
    protected String model;
    public SmartWatch(String model) {
        this.model = model;
    }
    public abstract void startMode();
    public abstract void endMode();
}

class FitnessMode extends SmartWatch {
    public FitnessMode(String model) {
        super(model);
    }
    @Override
    public void startMode() {
        System.out.println(model + " started Fitness Mode.");
    }
    @Override
    public void endMode() {
        System.out.println(model + " ended Fitness Mode.");
    }
}

class SleepMode extends SmartWatch {
    public SleepMode(String model) {
        super(model);
    }
    @Override
    public void startMode() {
        System.out.println(model + " started Sleep Mode.");
    }
    @Override
    public void endMode() {
        System.out.println(model + " ended Sleep Mode.");
    }
}

public class SmartWatchTest {
    public static void main(String[] args) {
        SmartWatch watch1 = new FitnessMode("Model X");
        watch1.startMode();
        watch1.endMode();
        
        SmartWatch watch2 = new SleepMode("Model Y");
        watch2.startMode();
        watch2.endMode();
    }
}
