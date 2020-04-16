package ca.monor.week07.W7_07_Dictionary;

import java.util.Scanner;

public class TextUserInterface {
    private Scanner reader;
    private Dictionary dictionary;
    public TextUserInterface(Scanner reader, Dictionary dictionary) {
        this.reader = reader;
        this.dictionary = dictionary;
    }

    public void start() {
        System.out.println("Statement: ");
        System.out.println("add - adds a word pair to the dictionary");
        System.out.println("translate - asks a word and prints its translation");
        System.out.println("quit - quit the text user interface\n");

        while (true) {
            System.out.print("Statement: ");
            String command = cleanString(this.reader.nextLine());
            if (command.equals("quit")) {
                System.out.println("Cheers!");
                break;
            }
            else if (command.equals("add")) {
                add();
            }
            else if (command.equals("translate")) {
                translate();
            } else {
                System.out.println("Unknown statement");
                System.out.println();
            }
        }
    }

    public String cleanString(String string) {
        string = string.toLowerCase();
        return string.trim();
    }

    public void add() {
        System.out.print("In Finnish: ");
        String inFinish = reader.nextLine();
        System.out.print("Translation: ");
        String translation = reader.nextLine();
        dictionary.add(inFinish, translation);
    }

    public void translate() {
        System.out.print("Give a word: ");
        String key = reader.nextLine();
        System.out.println(dictionary.translate(key));
    }
}
