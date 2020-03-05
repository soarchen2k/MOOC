package monor.week03;

import java.util.ArrayList;
import java.util.Collections;

public class Exercise066_TheGreatest {
    public static int greatest(ArrayList<Integer> list) {
        Collections.sort(list);
        return list.get(list.size()-1);

    }

    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<Integer>();
        lista.add(3);
        lista.add(2);
        lista.add(7);
        lista.add(2);

        System.out.println("The greatest number is: " + greatest(lista));
    }
}
