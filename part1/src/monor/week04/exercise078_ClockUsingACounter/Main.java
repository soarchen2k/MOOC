package monor.week04.exercise078_ClockUsingACounter;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BoundedCounter seconds = new BoundedCounter(59);
        BoundedCounter minutes = new BoundedCounter(59);
        BoundedCounter hours = new BoundedCounter(23);

        System.out.print("seconds: ");
        int s = scanner.nextInt();

        System.out.print("minutes: ");
        int m = scanner.nextInt();// read the initial value of minutes from the user
        System.out.print("hours: ");
        int h = scanner.nextInt();// read the initial value of hours from the user

        seconds.setValue(s);
        minutes.setValue(m);
        hours.setValue(h);
        int i = 0;
        while ( i < 121 ) {
            System.out.println(hours + ":" + minutes + ":" + seconds);   // the current time printed
            seconds.next();
            if (seconds.getValue() == 0) {
                minutes.next();
            }
            if (minutes.getValue() == 0 && seconds.getValue() == 0) {
                hours.next();
            }
            // advance minutes
            // if minutes become zero, advance hours
            i++;
        }
    }
}
