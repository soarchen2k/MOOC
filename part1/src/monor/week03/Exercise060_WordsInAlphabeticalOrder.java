package monor.week03;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Exercise060_WordsInAlphabeticalOrder {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList<String> words = new ArrayList<String>();
        String tempWord;

        while (true) {
            System.out.println("Type a word : ");
            tempWord = reader.nextLine();
            if (tempWord.equals("")) {
                System.out.println("You typed the following words: ");
                Collections.sort(words);

                for (Object word : words
                ) {
                    System.out.println(word);
                }
                break;
            } else {
                words.add(tempWord);
            }
        }
    }
}
