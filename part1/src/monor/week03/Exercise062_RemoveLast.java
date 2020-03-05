package monor.week03;

import java.util.ArrayList;
import java.util.Collections;

public class Exercise062_RemoveLast {
    public static void removeLast(ArrayList<String> list) {
        int length = list.size() - 1;
        list.remove(length);
    }

    public static void main(String[] args) {

        ArrayList<String> persons = new ArrayList<String>();
        persons.add("Pekka");
        persons.add("James");
        persons.add("Liz");
        persons.add("Brian");

        System.out.println("Person:");
        System.out.println(persons);
        Collections.sort(persons);

        removeLast(persons);
        System.out.println(persons);

    }
}
