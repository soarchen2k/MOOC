package monor.week04.exercise079_NumberStatistics;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        NumberStatistics stats = new NumberStatistics();
        NumberStatistics statisticsEven = new NumberStatistics();
        NumberStatistics statisticsOdd = new NumberStatistics();

        while (true) {
            System.out.println("Type numbers: ");
            int number = scanner.nextInt();
            if (number != -1 && number % 2 == 0) {
                stats.addNumber(number);
                statisticsEven.addNumber(number);
            } else if (number != -1 && number % 2 != 0) {
                stats.addNumber(number);
                statisticsOdd.addNumber(number);
            } else {
                break;
            }
        }

        System.out.println("Amount: " + stats.amountOfNumbers());
        System.out.println("sum: " + stats.sum());
        System.out.println("average: " + stats.average());
        System.out.println("sum of even: " + statisticsEven.sum());
        System.out.println("sum of odd: "+statisticsOdd.sum());
    }
}
