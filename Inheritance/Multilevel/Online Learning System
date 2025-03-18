class LearningMaterial {
    String title;
    String author;

    public LearningMaterial(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public void displayInfo() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }

    public void startLearning() {
        System.out.println("Starting learning: " + title);
    }
}

class Course extends LearningMaterial {
    int duration; 

    public Course(String title, String author, int duration) {
        super(title, author);
        this.duration = duration;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Duration: " + duration + " hours");
    }

    public void enroll() {
        System.out.println("Enrolled in course: " + title);
    }
}

class Tutorial extends LearningMaterial {
    String videoUrl;

    public Tutorial(String title, String author, String videoUrl) {
        super(title, author);
        this.videoUrl = videoUrl;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Video URL: " + videoUrl);
    }

    public void watchTutorial() {
        System.out.println("Watching tutorial at: " + videoUrl);
    }
}

public class OnlineLearningSystem {
    public static void main(String[] args) {
        Course javaCourse = new Course("Java Programming", "Traversy Media", 20);
        Tutorial javaTutorial = new Tutorial("Java Basics Tutorial", "Bro Code", "https://tutorial.com/java-basics");

        javaCourse.displayInfo();
        javaCourse.startLearning();
        javaCourse.enroll();
        System.out.println();

        javaTutorial.displayInfo();
        javaTutorial.startLearning();
        javaTutorial.watchTutorial();
    }
}
