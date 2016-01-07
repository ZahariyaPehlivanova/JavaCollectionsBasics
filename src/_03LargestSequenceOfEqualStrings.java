import java.util.Scanner;

public class _03LargestSequenceOfEqualStrings {

    public static void main(String[] args) {

        Scanner Console = new Scanner(System.in);
        System.out.println("Write an array of strings to find the largest sequence of equal elements");
        String[] input = Console.nextLine().split(" ");
        int maxCount = 1;
        int indexOfMaxElement = 0;

        for (int i = 0; i < input.length - 1; i++) {
            int currentCount = 1;
            String currentElement = input[i];

            while (i < input.length - 1 && currentElement.equals(input[i + 1])) {
                currentCount++;
                i++;
            }
            if (currentCount > maxCount) {
                maxCount = currentCount;
                i--;
                indexOfMaxElement = i;
            }
        }
        for (int i = 0; i < maxCount; i++) {
            System.out.print(input[indexOfMaxElement] + " ");
        }
     }
}

