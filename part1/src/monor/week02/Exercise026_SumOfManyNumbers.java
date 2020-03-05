package monor.week02;

import java.util.Scanner;

public class Exercise026_SumOfManyNumbers {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int sum = 0;

        while (true) {
            int read = Integer.parseInt(reader.nextLine());
            sum += read;
            if (read == 0) {
                break;
            }
            // do something here
            System.out.println("Sum now: " + sum);
        }
        System.out.println("Sum in the end: " + sum);
    }
}
