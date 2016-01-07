import java.util.*;

public class _11MostFrequentWord {
    public static void main(String[] args) {

        Scanner Console = new Scanner(System.in);

        System.out.println("Write a text");
        String[] text = Console.nextLine().toLowerCase().split("([().,!?:;'\"-]|\\s)+");

        Map<String, Integer> result = new LinkedHashMap<>();

        int count = 0;
        for (int i = 0; i < text.length; i++) {
            String currentWord = text[i];
            if(!result.containsKey(currentWord)){
                result.put(currentWord,0);
            }
            result.put(currentWord,result.get(currentWord)+1);
            if(result.get(currentWord) > count) {
                count = result.get(currentWord);
            }
        }
        for (Map.Entry<String, Integer> word : result.entrySet()) {
            if(word.getValue() == count) {
                System.out.printf("%s -> %d times\n", word.getKey(), word.getValue());
            }
        }
    }
}
