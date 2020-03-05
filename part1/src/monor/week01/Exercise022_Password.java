package monor.week01;

import java.util.Scanner;

public class Exercise022_Password {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        String password = "carrot"; // Use carrot as password when running tests.

        // Write your code here
        while (true) {
            System.out.println("Please input Password : ");
            String passInput = reader.nextLine();
            if (passInput.equals(password)) {
                System.out.println("Right!");
                System.out.println("The secret is: jryy qbar");
                break;
            } else {
                System.out.println("Wrong!");
            }
        }
    }
}
