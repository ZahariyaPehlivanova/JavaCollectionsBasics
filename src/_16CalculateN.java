import java.util.Scanner;

/**
 * Created by User on 26.10.2015 ã..
 */
public class _16CalculateN {
    public static void main(String[] args) {

        Scanner Console = new Scanner(System.in);
        System.out.println("Write a number to be calculated");

        int n = Integer.parseInt(Console.nextLine());
        int factorial = CalculateFactorial(n);
        System.out.println(factorial);
    }

    private static int CalculateFactorial(int number) {
        if (number == 1 || number == 0) {
            return 1;
        }
        return number * CalculateFactorial(number-1);
    }
}


