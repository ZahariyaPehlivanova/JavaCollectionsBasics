import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Scanner;

public class _02SequencesOfEqualStrings {

    public static void main(String[] args) {

        Scanner Console = new Scanner(System.in);
        System.out.println("Write an array of strings seperated by space");
        String[] input = Console.nextLine().split(" ");
        System.out.println();

        for (int i = 0; i < input.length; i++) {
            String currChar = input[i];
            String nextChar = "";
            if(i < input.length - 1) {
                nextChar = input[i + 1];
            } else {
                nextChar = currChar;
            }

            if (currChar.equals(nextChar)){
                System.out.print(currChar + " ");
            }
            else {
                System.out.println(currChar);
            }
        }
    }
}
