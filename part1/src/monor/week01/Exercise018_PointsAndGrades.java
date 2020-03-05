package monor.week01;

import java.util.Scanner;

public class Exercise018_PointsAndGrades {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        System.out.println("Type the points [0-60]: ");
        int points = Integer.parseInt(reader.nextLine());
        if (points < 0) {
            System.out.println("Wrong Input");
        } else if (points <= 29) {
            System.out.println("Failed");
        } else if (points <= 34) {
            System.out.println("Grade : 1");
        } else if (points <= 39) {
            System.out.println("Grade : 2");
        } else if (points <= 44) {
            System.out.println("Grade : 3");
        } else if (points <= 49) {
            System.out.println("Grade : 4");
        } else if (points <= 60) {
            System.out.println("Grade : 5");
        } else {
            System.out.println("Out of Bounds");
        }
    }
}
