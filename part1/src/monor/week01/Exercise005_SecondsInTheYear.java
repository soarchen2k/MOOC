package monor.week01;

import java.util.Scanner;

public class Exercise005_SecondsInTheYear {
    public static void main(String[] args) {
        System.out.println("Please Input Year : ");
        int getYear = new Scanner(System.in).nextInt();
        int daysInYear = leapYear(getYear) ? 366 : 365;
        int hoursInDay = 24;
        int minutesInHour = 60;
        int secondsInMinute = 60;
        int secondsInYear = daysInYear * hoursInDay * minutesInHour * secondsInMinute;

        System.out.println(getYear + " have "+daysInYear+" Days ");
        System.out.println("There are " + secondsInYear + " seconds in a year");
    }

    private static boolean leapYear(int year) {
        boolean leap = false;
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            leap = true;
            System.out.println(year + " is Leap Year.");
        }else{         System.out.println(year + " is NOT Leap Year.");}

        return leap;
    }
}
