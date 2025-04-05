import java.io.*;
import java.util.*;

public class SimpleFileEditor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        File file = new File("notes.txt");

        while (true) {
            System.out.println("\n Menu: 1. Write 2. Read 3. Append 4. Exit");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1 -> {
                    System.out.print("Enter content to write: ");
                    String content = scanner.nextLine();
                    writeFile(file, content, false);
                }
                case 2 -> readFile(file);
                case 3 -> {
                    System.out.print("Enter content to append: ");
                    String content = scanner.nextLine();
                    writeFile(file, content, true);
                }
                case 4 -> {
                    System.out.println("Exiting...");
                    return;
                }
                default -> System.out.println("Invalid choice!");
            }
        }
    }

    static void writeFile(File file, String content, boolean append) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(file, append))) {
            bw.write(content);
            bw.newLine();
            System.out.println(" File updated.");
        } catch (IOException e) {
            System.out.println(" Error: " + e.getMessage());
        }
    }

    static void readFile(File file) {
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            System.out.println(" File Content:");
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println(" Error: " + e.getMessage());
        }
    }
}
