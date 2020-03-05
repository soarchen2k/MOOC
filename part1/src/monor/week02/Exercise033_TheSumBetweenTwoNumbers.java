package monor.week02;

import java.util.Scanner;

public class Exercise033_TheSumBetweenTwoNumbers {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("First: ");
        int i = Integer.parseInt(reader.nextLine());
        System.out.print("Last: ");
        int range = Integer.parseInt(reader.nextLine());
        int sum = 0;

        while (i <= range) {
            sum += i;
            i++;
        }
        System.out.println("Sum is " + sum);
    }
}
