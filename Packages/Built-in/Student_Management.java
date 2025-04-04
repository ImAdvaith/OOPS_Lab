import java.util.*;
import java.io.*;
import java.lang.*;


class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

class Student {
    String name;
    int age;

    public Student(String name, int age) throws InvalidAgeException {
        if (age <= 0) {
            throw new InvalidAgeException("Age must be positive");
        }
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return name + " (" + age + ")";
    }
}

public class StudentManager {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            try {
                System.out.print("Enter student name (or 'exit' to quit): ");
                String name = scanner.nextLine();
                if (name.equalsIgnoreCase("exit")) {
                    break;
                }

                System.out.print("Enter student age: ");
                int age = Integer.parseInt(scanner.nextLine());

                Student student = new Student(name, age);
                students.add(student);
            } catch (InvalidAgeException e) {
                System.out.println("Error: " + e.getMessage());
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid number for age.");
            }
        }


        students.sort(Comparator.comparingInt(s -> s.age));


        System.out.println("Students (sorted by age):");
        for (Student student : students) {
            System.out.println(student);
        }
    }
}
