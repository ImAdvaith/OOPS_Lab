import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to calculate the sum of its digits: ");
        int num = scanner.nextInt();

        int sum = calculateSumOfDigits(num);
        System.out.println("The sum of the digits of " + num + " is: " + sum);
    }

    public static int calculateSumOfDigits(int num) {
        int sum = 0;
        while (num != 0) {
            sum += num % 10; 
            num /= 10; 
        }
        return sum;
    }
}
