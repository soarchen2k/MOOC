package ca.monor.week09.W9_19_MethodArgumentValidation.Cours.tryCatch.demo02;

import java.util.Scanner;

public class TryCatchDemo2 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Write a number: ");

        try {
            int num = Integer.parseInt(reader.nextLine());
            System.out.println("Looks good!");
        } catch (Exception e) {
            System.out.println("You haven't written a proper number.");
        }
    }
}
