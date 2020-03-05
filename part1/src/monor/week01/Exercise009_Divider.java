package monor.week01;

import java.util.Scanner;

public class Exercise009_Divider {
    public static void main(String[] args) {
        System.out.print("Type a number: ");
        Scanner reader = new Scanner(System.in);

        float number1 = reader.nextFloat();
        System.out.print("Type another number: ");
        float number2 = reader.nextFloat();

        float div = number1 / number2;
        System.out.println("Division: " + number1 + " / " + number2 + " = " + div);
    }
}
