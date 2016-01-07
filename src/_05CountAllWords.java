import java.util.Scanner;

/**
 * Created by User on 19.10.2015 ã..
 */
public class _05CountAllWords {
    public static void main(String[] args) {
        Scanner Console = new Scanner(System.in);
        System.out.println("Write a text");
        String[] input = Console.nextLine().toLowerCase().split("([().,!?:;'\"-]|\\s)+");
        int count = 0;

        for (int i = 0; i <input.length ; i++) {
            String word = input[i];
            count++;
        }
        System.out.println(count);
    }
}
