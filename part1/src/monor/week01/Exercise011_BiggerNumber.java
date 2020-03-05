package monor.week01;

import java.util.Scanner;

public class Exercise011_BiggerNumber {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        // Implement your program here. Remember to ask the input from user
        System.out.print("Type a number: ");
        int a = reader.nextInt();
        System.out.print("Type another number: ");
        int b = reader.nextInt();

        int max = Math.max(a, b);
        System.out.println("The bigger number of the two numbers given was: " + max);
    }
}
