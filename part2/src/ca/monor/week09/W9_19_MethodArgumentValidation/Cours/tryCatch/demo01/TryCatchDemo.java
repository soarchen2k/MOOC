package ca.monor.week09.W9_19_MethodArgumentValidation.Cours.tryCatch.demo01;

import java.util.Scanner;

public class TryCatchDemo {
    public static void main(String[] args) {
        int[] arr = new int[10];
        int counter = 0;
        Scanner scanner = new Scanner(System.in);
        while (counter < 10) {
            int number = 0;
            System.out.print("Type a number: ");
            try {
                number = Integer.parseInt(scanner.nextLine());
            } catch (Exception e) {
                System.out.println("Wrong type!");
            }
            if (number == -1) {
                System.out.println("Bye-Bye");
                break;
            } else if (number > 0) {
                arr[counter] = number;
                counter++;
            }
        }
        for (int a :
                arr) {
            System.out.print(a+" ");
        }
    }
}
