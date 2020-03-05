package monor.week02;

import java.util.Scanner;

public class Exercise030_UpToCertainNumber {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type the range : ");
        int range = Integer.parseInt(reader.nextLine());
        int number = 1;
        while (number <= range) {
            System.out.println(number);
            number++;
        }
    }
}
