package monor.week03;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise058_RecurringWord {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        ArrayList<String> words = new ArrayList<String>();
        String word;

        while (true) {
            System.out.println("Type a word: ");
            word = reader.nextLine();
            if (words.contains(word)) {
                System.out.println("You gave the word " + word + " twice");
                break;
            } else {
                words.add(word);
            }
        }
    }
}
