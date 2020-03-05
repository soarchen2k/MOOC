package monor.week02;

import java.util.Scanner;

public class Exercise034_Factorial {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int i = 1;
        int fact = 1;
        System.out.print("Type a number ");
        int range = Integer.parseInt(reader.nextLine());
            while (i <= range) {
                fact *= i;
                i++;
            }
        System.out.println("Factorial is " + fact);
    }
}
