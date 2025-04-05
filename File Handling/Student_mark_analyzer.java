import java.io.*;
import java.util.*;

public class StudentMarksAnalyzer {
    public static void main(String[] args) {
        File file = new File("student.txt");

        String topper = "";
        int highestMarks = 0;
        int totalMarks = 0;
        int studentCount = 0;

        try (Scanner sc = new Scanner(file)) {
            while (sc.hasNext()) {
                String name = sc.next();
                int marks = sc.nextInt();

                totalMarks += marks;
                studentCount++;

                if (marks > highestMarks) {
                    highestMarks = marks;
                    topper = name;
                }
            }

            if (studentCount > 0) {
                double average = (double) totalMarks / studentCount;
                System.out.println("Total students: " + studentCount);
                System.out.println("Average marks: " + average);
                System.out.println("Topper: " + topper + " (" + highestMarks + ")");
            } else {
                System.out.println("No student data found.");
            }

        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        } catch (InputMismatchException e) {
            System.out.println("Invalid data format in file.");
        }
    }
}
