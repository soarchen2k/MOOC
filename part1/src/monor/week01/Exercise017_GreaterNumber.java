package monor.week01;

import java.util.Scanner;

public class Exercise017_GreaterNumber {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // Type your program here
        System.out.print("Type the first number: ");
        int num1 = Integer.parseInt(reader.nextLine());
        System.out.print("Tyoe the second Number: ");
        int num2 = Integer.parseInt(reader.nextLine());

        if (num1 == num2) {
            System.out.println("The numbers are equal !");
        } else {
            System.out.println("Greater Number: " + (num1 > num2 ? num1 : num2));
        }
    }
}
