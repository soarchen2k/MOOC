package monor.week06.exercise098_CopyAndReverse;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] original = {1, 2, 3, 4};
        int[] copied = copy(original);
        int[] reverse = reverseCopy(original);

        // change the copied
        copied[0] = 99;

        // print both
        System.out.println( "original: " + Arrays.toString(original));
        System.out.println( "copied: " + Arrays.toString(copied));
        System.out.println( "reversed: " +Arrays.toString(reverse));
    }

    private static int[] reverseCopy(int[] array) {
        int[] reverse = copy(array);
        swap(reverse);
        return reverse;
    }

    private static void swap(int[] original) {
        int swap;
        for (int i = 0; i < original.length / 2; i++) {
            swap = original[i];
            original[i] = original[original.length - 1 - i];
            original[original.length - 1 - i] = swap;
        }
    }

    public static int[] copy(int[] array) {
        return Arrays.copyOf(array, array.length);
    }
}
