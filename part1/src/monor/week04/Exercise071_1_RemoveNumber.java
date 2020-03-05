package monor.week04;

import java.util.ArrayList;
import java.util.Collections;

public class Exercise071_1_RemoveNumber {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        Collections.addAll(numbers, 4, 3, 5, 3);
        printArrayList(numbers);
        while (numbers.contains(Integer.valueOf(3))) {
            numbers.remove(Integer.valueOf(3));
        }
        printArrayList(numbers);
    }

    public static void printArrayList(ArrayList<Integer> numbers) {
        for (int number :
                numbers) {
            System.out.println(number);
        }
    }
}
