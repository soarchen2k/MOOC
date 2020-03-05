package monor.week03;

import java.util.Scanner;

public class Exercise052_ReversingName {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        System.out.printf("Type your name: ");
        String name = reader.nextLine();

        int nameLength = name.length();

        System.out.printf("In reverse order: ");

        for (int i = nameLength - 1; i >= 0; i--) {
            System.out.print(name.charAt(i));
        }
    }
}
