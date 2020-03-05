package monor.week02;

import java.util.Scanner;

public class Exercise038_ManyPrints {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("How many? ");
        int i = 0;
        int times = Integer.parseInt(reader.nextLine());

        while (i < times) {
            printText();
            i++;
        }
    }

    public static void printText() {
        System.out.println("In the beginning there were the swamp, the hoe and Java.");
    }
}
