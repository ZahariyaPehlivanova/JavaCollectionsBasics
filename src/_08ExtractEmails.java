import jdk.nashorn.internal.runtime.regexp.joni.Regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class _08ExtractEmails {
    public static void main(String[] args) {
        Scanner Console = new Scanner(System.in);
        System.out.println("Write text with e-mails in it");

        String text = Console.nextLine();
        Pattern regex = Pattern.compile("[a-z]+.[a-z]+@[a-z]+.[a-z]+");
        Matcher match = regex.matcher(text);

        while (match.find()){
            System.out.println(match.group());
        }
    }
}
