package monor.week03;

import java.util.Scanner;

public class Exercise048_FirstCharacter {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        System.out.println("Type your name: ");

        System.out.println("First character: "+firstCharacter(reader.nextLine()));

    }



    public static char firstCharacter(String name) {

        return name.charAt(0);

    }
}
