package monor.week06.exercise097_ElegantPrinting;

import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {
        // test method here
        int[] array = {5, 1, 3, 4, 2};
        printElegantly(array);
    }

    public static void printElegantly(int[] array) {
        IntStream.range(0, array.length).mapToObj(i -> (i < array.length - 1) ? array[i] + ", " : array[i]).forEach(System.out::print);
    }
}