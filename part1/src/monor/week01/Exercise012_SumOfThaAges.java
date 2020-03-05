/**
 * 使用
 * Scanner reader = new Scanner(System.in);
 * Integer.parseInt(reader.nextLine())
 * 语句组合，可以只定义一次Scanner，多次使用 reader 进行录入
 */
package monor.week01;

import java.util.Scanner;

public class Exercise012_SumOfThaAges {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // Implement your program here

        printTip("Type your name : ");
        String name1 = reader.nextLine();

        printTip("Type your age : ");
        int age1 = Integer.parseInt(reader.nextLine());

        printTip("Type your name : ");
        String name2 = reader.nextLine();

        printTip("Type your age : ");
        int age2 = Integer.parseInt(reader.nextLine());

        int totalAge = Math.addExact(age1, age2);
        System.out.println(name1 + " and " + name2 + " are " + totalAge + " years old in total.");
    }

    private static void printTip(String a) {
        System.out.print(a);
    }
}
