package monor.week01;

import java.util.Scanner;

public class Exercise010_CalculateThecirCumference {
    public static void main(String[] args) {
        System.out.println("Type the radius: ");
        double radius = new Scanner(System.in).nextDouble();
        double pi = Math.PI;
        double circumference = 2 * pi * radius;
        System.out.println("Circumference of the circle: " + circumference);
    }
}
