package ca.monor.week09.W9_24_MultipleEntryDictionary.cours.ManyValuesAndOneKey;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 48. Hashmaps and Sets
 * Many Values and One Key
 */

public class Main {
    public static void main(String[] args) {
        Map<String, List<String>> phoneNumbers = new HashMap<>();
        phoneNumbers.put("pekka", new ArrayList<>());
        phoneNumbers.get("pekka").add("040-12345678");
        phoneNumbers.get("pekka").add("040-87654321");
        System.out.println(phoneNumbers.get("pekka"));
    }
}
