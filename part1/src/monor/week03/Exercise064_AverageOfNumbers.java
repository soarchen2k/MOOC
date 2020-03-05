package monor.week03;

import java.util.ArrayList;

public class Exercise064_AverageOfNumbers {
    public static int sum(ArrayList<Integer> list) {
        int sum = 0;
        for (int value : list
        ) {
            sum += value;
        }
        return sum;
    }


    public static double average(ArrayList<Integer> list) {
        double ave;
        ave = (double) sum(list) / (double) list.size();
        return ave;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(3);
        list.add(2);
        list.add(7);
        list.add(2);

        System.out.println("The average is: " + average(list));
    }
}
