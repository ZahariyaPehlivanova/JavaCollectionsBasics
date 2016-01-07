import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ProblemStuckNumbers01 {

    public static void main(String[] args) {

        Scanner Console = new Scanner(System.in);
        System.out.println("Write number n and n numbers(seperated by space) on a different lines ");
        int n = Integer.parseInt(Console.nextLine());
        int[] numbers = new int[n];

        for (int i = 0; i <numbers.length; i++) {
            numbers[i] = Console.nextInt();

        }
        int count = 0;
        if(n > 3){
            for (int a = 0; a < numbers.length; a++) {
              for (int b = 0; b < numbers.length; b++) {
                  for (int c = 0; c < numbers.length; c++) {
                      for (int d = 0; d < numbers.length; d++) {

                          if(numbers[a]!= numbers[b] && numbers[a]!= numbers[c] && numbers[a]!= numbers[d]
                              && numbers[b] != numbers[c] && numbers[b] != numbers[d] && numbers[c] != numbers[d]){

                              if(("" + numbers[a] + numbers[b]).equals("" + numbers[c] + numbers[d])){
                                  System.out.printf("%s|%s == %s|%s\n",numbers[a],numbers[b],numbers[c],numbers[d]);
                                  count++;
                              }
                          }
                      }
                  }
              }
          }
        }
        if(count == 0 || n < 4){
            System.out.println("No");
        }
    }
}
