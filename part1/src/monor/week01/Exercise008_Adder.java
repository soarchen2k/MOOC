package monor.week01;

import java.util.Scanner;

public class Exercise008_Adder {
    public static void main(String[] args) {
        System.out.print("Type a number: ");
        Scanner reader = new Scanner(System.in);

        // Implement your program here. Remember to ask the input from user

        int number1 = Integer.parseInt(reader.nextLine());

        System.out.print("Type another number: ");
        int number2 = Integer.parseInt(reader.nextLine());

        System.out.println();
        System.out.println("Sum of the numbers: " + (number1 + number2));
    }
}
