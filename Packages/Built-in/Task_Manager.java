import java.util.*;
import java.lang.*;
import java.io.*;

public class TaskManager {
    public static void main(String[] args) {
        List<String> tasks = new ArrayList<>();
        Scanner scanner = new Scanner(System.in); 

        try (BufferedReader reader = new BufferedReader(new FileReader("tasks.txt"))) {
            String task;
            while ((task = reader.readLine()) != null) {
                tasks.add(task);
            }
        } catch (IOException e) {
            System.out.println("No previous tasks found.");
        }

        while (true) {
            System.out.println("\nTask Manager Menu:");
            System.out.println("1. Add Task");
            System.out.println("2. View Tasks");
            System.out.println("3. Remove Task");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int option = Integer.parseInt(scanner.nextLine()); 
            switch (option) {
                case 1:
                    System.out.print("Enter new task: ");
                    String task = scanner.nextLine();
                    tasks.add(task);
                    break;
                case 2:
                    if (tasks.isEmpty()) {
                        System.out.println("No tasks available.");
                    } else {
                        System.out.println("\nCurrent Tasks:");
                        tasks.forEach(System.out::println);
                    }
                    break;
                case 3:
                    System.out.print("Enter task to remove: ");
                    String taskToRemove = scanner.nextLine();
                    if (tasks.remove(taskToRemove)) {
                        System.out.println("Task removed.");
                    } else {
                        System.out.println("Task not found.");
                    }
                    break;
                case 4:
                    try (BufferedWriter writer = new BufferedWriter(new FileWriter("tasks.txt"))) {
                        for (String t : tasks) {
                            writer.write(t);
                            writer.newLine();
                        }
                    } catch (IOException e) {
                        System.out.println("Error saving tasks: " + e.getMessage());
                    }
                    System.out.println("Tasks saved to 'tasks.txt'.");
                    return;
                default:
                    System.out.println("Invalid option. Try again.");
            }
        }
    }
}
