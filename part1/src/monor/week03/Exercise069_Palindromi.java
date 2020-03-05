package monor.week03;

import java.util.Scanner;

public class Exercise069_Palindromi {
    public static boolean palindrome(String text) {
        String textRevers = "";
        for (int i = text.length(); i > 0; i--) {
            textRevers += text.charAt(i - 1);
        }
        System.out.println(textRevers);
        return textRevers.equals(text);
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Type a text: ");
        String text = reader.nextLine();
        if (palindrome(text)) {
            System.out.println("The text is a palindrome!");
        } else {
            System.out.println("The text is not a palindrome!");
        }
    }
}
