package monor.week06.exercise104_Sorting;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        int[] values = new int[50000];
        Random random = new Random();
        for (int i = 0; i < values.length; i++) {
            values[i] = random.nextInt(100000);
        }
        Arrays.sort(values);
//                sort(values);
        System.out.println(System.currentTimeMillis() - start);
    }

    public static int smallest(int[] array) {
        return array[indexOfTheSmallest(array)];
    }

    public static int indexOfTheSmallest(int[] array) {
        int min = array[0];
        int minIndex = 0;
        for (int i = 1; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
                minIndex = i;
            }
        }
        return minIndex;
    }

    public static int indexOfTheSmallestStartingFrom(int[] array, int index) {
        int min = array[index];
        int minIndex = index;
        for (int i = index + 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
                minIndex = i;
            }
        }
        return minIndex;
    }

    public static void swap(int[] array, int index1, int index2) {
        int temp;
        temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    public static void sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int index1 = indexOfTheSmallestStartingFrom(array, i);
            swap(array, index1, i);
//            show(array);
//            System.out.println();
        }
    }

    private static void show(int[] array) {
        System.out.print("[ ");
        for (int a :
                array) {
            System.out.print(a + " ");
        }
        System.out.print("]");
    }
}
