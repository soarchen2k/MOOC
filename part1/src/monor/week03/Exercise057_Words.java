package monor.week03;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise057_Words {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        ArrayList word = new ArrayList<String>();
        String wordTyped;

        while (true) {
            System.out.print("Type a word: ");
            wordTyped = reader.nextLine();
            if (wordTyped.equals("")) {
                break;
            } else {
                word.add(wordTyped);
            }
        }

        System.out.println("You typed the following words:");
        for (Object aWord : word) {
            System.out.print(aWord+" ");
        }
    }
}
