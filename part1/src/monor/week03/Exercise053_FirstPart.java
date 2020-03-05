package monor.week03;

import java.util.Scanner;

public class Exercise053_FirstPart {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        System.out.println("substring Type your name: ");

        String name = reader.nextLine();

        System.out.println("Length of the first part: ");

        int partLength = Integer.parseInt(reader.nextLine());

        substring(name, partLength);

    }



    public static void substring(String name, int length) {

        System.out.println("Result: " + name.substring(0, length));



    }
}
