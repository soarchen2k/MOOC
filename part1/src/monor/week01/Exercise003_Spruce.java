package monor.week01;

import java.util.Scanner;

public class Exercise003_Spruce {
    public static void main(String[] args) {
        System.out.println("Please Input Lines : ");
        int lines = new Scanner(System.in).nextInt();
        printPine(lines);
        for (int j = 0; j < 2; j++) {
            for (int i = 0; i < lines - 1; i++) {
                System.out.print(" ");
            }
            System.out.print("*");
            System.out.println();
        }

    }

    private static void printPine(int lines) {
        for (int i = 0; i < lines; i++) {
            for (int j = 0; j < lines - 1 - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i * 2 + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
