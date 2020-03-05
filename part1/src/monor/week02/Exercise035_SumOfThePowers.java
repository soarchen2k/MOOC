package monor.week02;

import java.util.Scanner;

public class Exercise035_SumOfThePowers {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int sum = 0;
        System.out.printf("Type a number: ");
        int range = Integer.parseInt(reader.nextLine());

        for (int i = 0; i <= range; i++) {
            sum += Math.pow(2, i);
        }
        System.out.printf("The result is " + (int) sum);
    }
}
