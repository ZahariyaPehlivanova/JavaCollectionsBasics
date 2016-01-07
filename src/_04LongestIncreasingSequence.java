import java.util.Scanner;

public class _04LongestIncreasingSequence {

    public static void main(String[] args) {

        Scanner Console = new Scanner(System.in);
        System.out.println("Write an array of integers seperated by space");
        String[] arrayStr = Console.nextLine().split(" ");
        int maxSequence = 1;
        int indexMaxStart = 0;

        for (int i = 0; i < arrayStr.length; i++) {
            System.out.print(Integer.parseInt(arrayStr[i]));
            int counter = 1;

            while (i < arrayStr.length - 1&& Integer.parseInt(arrayStr[i]) < Integer.parseInt(arrayStr[i + 1])) {
                counter++;
                System.out.printf(" %d", Integer.parseInt(arrayStr[i + 1]));
                i++;
            }
            System.out.println();
            if (counter > maxSequence) {
                maxSequence = counter;
                indexMaxStart = (i + 1) - maxSequence;
            }
        }
        System.out.print("Longest: ");
        for (int j = indexMaxStart; j < indexMaxStart + maxSequence; j++) {
            System.out.printf("%d ", Integer.parseInt(arrayStr[j]));
        }
    }
}