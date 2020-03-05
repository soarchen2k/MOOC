package monor.week01;

import java.util.Scanner;

public class Exercise020_Usernames {
    public static void main(String[] args) {
        String name1 = "alex", pass1 = "mightyducks", name2 = "emily", pass2 = "cat";
        Scanner reader = new Scanner(System.in);

        System.out.println("Type your username: ");
        String username1 = reader.nextLine();

        System.out.println("Type your password : ");
        String password1 = reader.nextLine();

        if (username1.equals(name1) && password1.equals(pass1)) {
            System.out.println("Your are now logged into the system!");
        } else if (username1.equals(name2) && password1.equals(pass2)) {
            System.out.println("Your are now logged into the system!");
        } else {
            System.out.println("Your username or password was invalid");
        }
    }
}
