import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class _13FilterArray {
    public static void main(String[] args) {

        Scanner Console = new Scanner(System.in);

        System.out.println("Write a text to be filtered");

        ArrayList<String> result = new ArrayList<>(Arrays.asList(Console.nextLine().split("\\s+")));

        result.stream().filter(word -> word.length() > 3).forEach(word -> System.out.printf("%s ", word));

    }
}