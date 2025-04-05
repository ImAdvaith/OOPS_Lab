import java.io.*;
import java.util.*;

public class LineFilter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter file name (with path if needed): ");
        String filePath = sc.nextLine();

        File file = new File(filePath);
        if (!file.exists()) {
            System.out.println(" File does not exist.");
            return;
        }

        System.out.print("Enter keyword to search: ");
        String keyword = sc.nextLine().toLowerCase();

        int matchCount = 0, lineCount = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            System.out.println("\n Matching lines:\n");

            while ((line = br.readLine()) != null) {
                lineCount++;
                if (line.toLowerCase().contains(keyword)) {
                    System.out.println("Line " + lineCount + ": " + line);
                    matchCount++;
                }
            }

            if (matchCount == 0) {
                System.out.println(" No matches found.");
            } else {
                System.out.println("\n " + matchCount + " match(es) found out of " + lineCount + " lines.");
            }

        } catch (IOException e) {
            System.out.println(" Error: " + e.getMessage());
        }
    }
}
