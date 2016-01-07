import java.util.Scanner;

/**
 * Created by User on 19.10.2015 ã..
 */
public class _06CountSpecifiedWord {
    public static void main(String[] args) {

        Scanner Console = new Scanner(System.in);
        System.out.println("Write a text and a word to be count on a different lines");

        String[] input = Console.nextLine().toLowerCase().split("([().,!?:;'\"-]|\\s)+");
        String word = Console.nextLine();
        int count = 0;

        for (int i = 0; i < input.length; i++) {
            if(input[i].equals(word)){
                count++;
            }
        }
        System.out.println(count);
    }
}
