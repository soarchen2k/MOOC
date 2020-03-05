package monor.week04;

import java.util.ArrayList;
import java.util.Collections;

public class Exercise070_CombiningArrayLists {
    public static void main(String[] args) {

        // You can change the values while testing
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        ArrayList<Integer> list2 = new ArrayList<Integer>();

        Collections.addAll(list1, 4, 3);
        Collections.addAll(list2, 5, 10, 7);

        System.out.println(list1);
        System.out.println(list2);
        combine(list1, list2);
    }

    public static void combine(ArrayList<Integer> first, ArrayList<Integer> second) {
        first.addAll(second);
        System.out.println(first);
    }
}
