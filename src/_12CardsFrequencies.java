import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public interface _12CardsFrequencies {
    public static void main(String[] args) {

        Scanner Console = new Scanner(System.in);
        System.out.println("Write a text with cards");

        String[] text = Console.nextLine().split(" ");

        Map<String, Integer> result = new LinkedHashMap<>();

        int count = text.length;
        for (int i = 0; i < text.length; i++) {
            String card = text[i].substring(0,text[i].length()-1);
            if(!result.containsKey(card)){
                result.put(card,0);
            }
            result.put(card,result.get(card)+1);
        }
        for (Map.Entry<String, Integer> card : result.entrySet()) {
            double percentage = ((double)card.getValue() / count)*100;
            System.out.printf("%s -> %.2f%%\n", card.getKey(), percentage);
        }
    }
}
