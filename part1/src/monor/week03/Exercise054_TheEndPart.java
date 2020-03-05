package monor.week03;

import java.util.Scanner;

public class Exercise054_TheEndPart {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type a word: ");
        String name = reader.nextLine();

        System.out.println("Length of the end part: ");
        int partLength = Integer.parseInt(reader.nextLine());
        substring(name, partLength);
    }



    public static void substring(String name, int length) {

        System.out.println("Result: " + name.substring(name.length() - length));

    }
}
