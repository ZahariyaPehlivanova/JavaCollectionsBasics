import java.awt.*;
import java.awt.List;
import java.util.*;

public class _14SortArrayWithStreamAPI {
    public static void main(String[] args) {
        Scanner Console = new Scanner(System.in);
        System.out.println("Write numbers to be sorted and a command on a different line");

        ArrayList<String> numbers = new ArrayList<>(Arrays.asList(Console.nextLine().split("\\s+")));
        String command = Console.nextLine();

        if (command.equals("Ascending")) {
            numbers.stream()
                    .map(str -> Integer.parseInt(str))
                    .sorted((num1, num2) -> num1.compareTo(num2))
                    .forEach(num -> System.out.print(num + " "));
        }
        else if(command.equals("Descending")){
            numbers.stream()
                    .map(str -> Integer.parseInt(str))
                    .sorted((num1, num2) -> num2.compareTo(num1))
                    .forEach(num -> System.out.print(num + " "));
        }
        else{
            System.out.println("Invalid command");
        }

    }
}
