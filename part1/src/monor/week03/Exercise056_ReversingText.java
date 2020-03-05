package monor.week03;

import java.util.Scanner;

public class Exercise056_ReversingText {
    public static String reverse(String text) {
        String textRevers = "";
        int length = text.length() - 1;
        for (int i = length; i >= 0; i--) {
            textRevers += text.charAt(i);
        }
        return textRevers;
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type in your text: ");

        String text = reader.nextLine();
        System.out.println("In reverse order: " + reverse(text));
    }
}
