package monor.week01;

import java.util.Scanner;

public class Exercise014_APositifNumber {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

            // Type your program here:

        System.out.println("Type a number: ");
        int a = Integer.parseInt(reader.nextLine());
        if (a == 0) {
            System.out.println("The number is 0");
        } else if (a > 0) {
            System.out.println("Positive");
        } else {
            System.out.println("Negative");
        }

    }
}
