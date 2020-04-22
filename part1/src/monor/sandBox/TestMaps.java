package monor.sandBox;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class TestMaps {
    public static void main(String[] args) {
        Map<Integer, String> hashMap = new HashMap<>();
        Map<Integer, String> linkedHashMap = new LinkedHashMap<>();
        Map<Integer, String> treeMap = new TreeMap<>();

        testMap(hashMap);
        testMap(linkedHashMap);
        testMap(treeMap);
    }

    private static void testMap(Map<Integer, String> map) {
        map.put(6, "asd");
        map.put(0, "bsd");
        map.put(24, "zsd");
        map.put(12, "dsd");
        map.put(32, "xsd");
        map.put(53, "fsd");
        map.put(1, "gsd");
        map.put(7, "hsd");
        map.put(9, "isd");

        System.out.println(map.getClass());
        for (Integer key : map.keySet()) {
            System.out.println(key + ", " + map.get(key));
        }
    }
}
