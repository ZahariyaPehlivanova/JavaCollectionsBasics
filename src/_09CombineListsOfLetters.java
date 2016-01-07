import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class _09CombineListsOfLetters {
    public static void main(String[] args) {
        Scanner Console = new Scanner(System.in);
        System.out.println("Write two two lists of letters on a different lines");

        ArrayList<Character> first = new ArrayList(Arrays.asList(Console.nextLine().split("\\s+")));
        ArrayList<Character> second = new ArrayList(Arrays.asList(Console.nextLine().split("\\s+")));

        for (int i = 0; i < second.size(); i++) {
            if (!first.contains(second.get(i))) {
                first.add(second.get(i));
            }
        }
        for (int i = 0; i < first.size(); i++) {
            System.out.print(first.get(i) + " ");
        }
    }
}
