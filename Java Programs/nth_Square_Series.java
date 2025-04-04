import java.util.Scanner;

public class Square_Series

{

    public static void main(String[] args) 

    {

        int n, sum = 0;

        Scanner s = new Scanner(System.in);

        System.out.println("Given series:1^2 + 2^2 + 3^2......... +n^2");

        System.out.print("Enter value of n:");

        n = s.nextInt();

        for(int i = 1; i <= n; i++)

        {

            sum = sum + i * i;

        }

        System.out.println("Sum of series:" + sum);

    }

}
