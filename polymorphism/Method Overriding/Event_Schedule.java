abstract class Event {
    public abstract String scheduleEvent();
}

class ConferenceEvent extends Event {
    @Override
    public String scheduleEvent() {
        return "Scheduled a conference with speakers .";
    }
}

class WorkshopEvent extends Event {
    @Override
    public String scheduleEvent() {
        return "Scheduled a workshop with hands-on sessions.";
    }
}

class EventScheduler {
    public void scheduleEvent(Event event) {
        System.out.println(event.scheduleEvent());
    }
}

public class Main {
    public static void main(String[] args) {
        EventScheduler scheduler = new EventScheduler();
        scheduler.scheduleEvent(new ConferenceEvent());
        scheduler.scheduleEvent(new WorkshopEvent());
    }
}
