package monor.week02;

import java.util.Scanner;

public class Exercise031_LowerLimitAndUpperLimit {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("First: ");
        int first = Integer.parseInt(reader.nextLine());

        System.out.print("Last: ");
        int last = Integer.parseInt(reader.nextLine());

            while (first <= last) {
                System.out.println(first);
                first++;
        }
    }
}
