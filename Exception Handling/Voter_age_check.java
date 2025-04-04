import java.util.Scanner;

class UnderageException extends Exception {
    public UnderageException(String message) {
        super(message);
    }
}

public class VotingSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age;

        try {
            age = Integer.parseInt(sc.nextLine());
            if (age < 18) {
                throw new UnderageException(" You are not eligible to vote.");
            }
            System.out.println(" You can vote!");
        } catch (NumberFormatException e) {
            System.out.println(" Invalid input. Please enter a number.");
        } catch (UnderageException e) {
            System.out.println(e.getMessage());
        }
    }
}
