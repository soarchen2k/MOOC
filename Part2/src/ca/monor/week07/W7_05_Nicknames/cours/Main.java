package ca.monor.week07.W7_05_Nicknames.cours;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<String, String> numbers = new HashMap<>();
        numbers.put("One", "Yksi");
        numbers.put("Two", "Kaksi");
        numbers.put("One", "Uno");

        String translation = numbers.get("One");
        System.out.println(translation);
        System.out.println(numbers.get("Two"));
        System.out.println(numbers.get("Three"));
        System.out.println(numbers.get("Yksi"));
    }
}
