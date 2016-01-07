import java.util.Scanner;

public class _07CountSubstringOccurrences {
    public static void main(String[] args) {
        Scanner Console = new Scanner(System.in);

        System.out.println("Write a text and one  string on a different lines");

        String input = Console.nextLine().toLowerCase();
        String word = Console.nextLine().toLowerCase();

        int count = 0;
        for (int i = 0; i < input.length()- word.length() + 1; i++) {
            String substring = input.substring(i,i + word.length());

          if (substring.equals(word)){
              count++;
          }
        }
        System.out.print(count);
    }
}