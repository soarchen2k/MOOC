package ca.monor.week07.W7_07_Dictionary;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String input = "add\n"  + "cheese\n" + "juusto\n" +
                "add\n"  + "bier\n" + "olut\n" +
                "add\n"  + "book\n" + "kirja\n" +
                "add\n"  + "computer\n" + "tietokone\n" +
                "add\n"  + "auto\n" + "car\n" +
                "quit\n";


        Scanner reader = new Scanner(input);

        Dictionary dict = new Dictionary();


        TextUserInterface ui = new TextUserInterface(reader, dict);

        ui.start();
    }
}