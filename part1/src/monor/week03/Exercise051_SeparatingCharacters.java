package monor.week03;

import java.util.Scanner;

public class Exercise051_SeparatingCharacters {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        System.out.println("Type your name: ");

        String name = reader.nextLine();

        int nameLength = name.length();

        for (int i = 0; i < nameLength; i++) {

            System.out.println((i + 1) + ". Character: " + name.charAt(i));

        }

    }
}
