import java.util.Random;

class OnlineExam {
    private String studentName;
    private int studentID;
    private int marks;
    private boolean cheatingDetected;

    public OnlineExam(String name, int id) {
        this.studentName = name;
        this.studentID = id;
        this.marks = 0;
        this.cheatingDetected = false;
    }

    public void setmarks(int score) {
        if (score >= 0 && score <= 100) {
            this.marks = score;
            System.out.println("Exam completed. marks recorded.");
        } else {
            System.out.println("Invalid marks input.");
        }
    }

    public void detectCheating() {
        Random rand = new Random();
        cheatingDetected = rand.nextBoolean(); 

        if (cheatingDetected) {
            System.out.println(" Cheating detected! Exam invalidated.");
            this.marks = 0; // Nullify marks
        } else {
            System.out.println(" No cheating detected.");
        }
    }

    public void getExamResult() {
        System.out.println("\n Student: " + studentName + " (ID: " + studentID + ")");
        if (cheatingDetected) {
            System.out.println(" Exam Result: Invalid (Cheating Detected)");
        } else {
            System.out.println(" Exam marks: " + marks + "/100");
        }
    }
}

public class OnlineExamSystem {
    public static void main(String[] args) {
        OnlineExam student1 = new OnlineExam("Karthi", 24253);

        student1.setmarks(85);
        student1.detectCheating();
        student1.getExamResult();
    }
}
