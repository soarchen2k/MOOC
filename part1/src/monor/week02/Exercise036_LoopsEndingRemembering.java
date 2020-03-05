package monor.week02;

import java.util.Scanner;

public class Exercise036_LoopsEndingRemembering {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type numbers: ");
        int sum = 0;
        int i = 0;
        int even = 0;
        while (true) {
            int number = Integer.parseInt(reader.nextLine());
            if (number == -1) {
                break;
            }
            if (number % 2 == 0) {
                even++;
            }
            i++;
            sum += number;
        }
        System.out.println("Thank you and see you again");
        System.out.println("The sum is " + sum);
        System.out.println("How many numbers: " + i);
        System.out.println("Average: " + ((double) sum / (double) i));
        System.out.println("Even numbers: " + even);
        System.out.println("Odd numbers: " + (i - even));
    }
}
