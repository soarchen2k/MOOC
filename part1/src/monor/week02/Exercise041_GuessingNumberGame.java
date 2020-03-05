package monor.week02;

import java.util.Random;
import java.util.Scanner;

public class Exercise041_GuessingNumberGame {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int numberDrawn = drawNumber();
        int guessNumber;
        int count = 0;
        while (true) {
            count++;
            System.out.print("Guess a number: ");
            guessNumber = Integer.parseInt(reader.nextLine());
            if (guessNumber == numberDrawn) {
                System.out.println("Congratulations, your guess is correct!");
                break;
            } else{
                System.out.println(guessNumber > numberDrawn ? "The number is lesser, guesses made: "
                        + count : "The number is greater, guesses made: " + count);
            }
        }


        // program your solution here. Do not touch the above lines!

    }

    // DO NOT MODIFY THIS!
    private static int drawNumber() {
        return new Random().nextInt(101);
    }
}
