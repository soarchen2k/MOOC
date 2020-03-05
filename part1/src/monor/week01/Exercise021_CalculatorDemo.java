package monor.week01;

import java.util.Scanner;

public class Exercise021_CalculatorDemo {
    public static void main(String[] args) {
        while (true) {
            System.out.println("Enter a command (sum, diff, prdt, div, quit");
            String command = new Scanner(System.in).nextLine();
            if (command.equals("quit")) {
                break;
            }

            System.out.println("Enter 2 Numbers");
            int a = new Scanner(System.in).nextInt();
            int b = new Scanner(System.in).nextInt();

            if (command.equals("sum")) {
                int sum = Math.addExact(a, b);
                System.out.println("sum = " + sum);
            }

            else if (command.equals("diff")) {
                int diff = Math.subtractExact(a, b);
                System.out.println("difference = " + diff);
            }

            else if (command.equals("prdt")) {
                int prdt = Math.multiplyExact(a, b);
                System.out.println("Product = " + prdt);
            }

            else if (command.equals("div")) {
                int div = Math.floorDiv(a, b);
                System.out.println("Div = " + div);
            }
        }
        System.out.println("ByeBye");
    }
}
