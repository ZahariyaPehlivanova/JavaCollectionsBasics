import java.util.*;

/**
 * Created by User on 23.10.2015 ã..
 */
public class _10ExtractAllUniqueWords {
    public static void main(String[] args) {
        Scanner Console = new Scanner(System.in);
        System.out.println("Write the string to be sorted");
        String[] text = Console.nextLine().split("([().,!?:;'\"-]|\\s)+");
        List<String> result = new ArrayList<>();

        for (int i = 0; i < text.length; i++) {
            if (!result.contains(text[i].toLowerCase())){
                result.add(text[i].toLowerCase());
            }
        }
        Collections.sort(result);
        System.out.println(result);
//        result.stream()
//                .sorted((num1, num2) -> num1.compareTo(num2))
//                .forEach(num -> System.out.print(num + " "));


    }
}
