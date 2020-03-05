package monor.week02;

import java.util.Scanner;

public class Exercise032_TheSumOfSetOfNumbers {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int i = 1;
        int sum = 0;
        System.out.print("Until what? ");
        int range = Integer.parseInt(reader.nextLine());
        while (i <= range) {
            sum += i;
            i++;
        }
        System.out.println("Sum is " + sum);
    }
}
