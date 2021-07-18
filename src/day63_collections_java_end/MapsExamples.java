package day63_collections_java_end;

import java.util.HashMap;
import java.util.Map;

public class MapsExamples {
    public static void main(String[] args) {
        // id, names
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "John");
        map.put(2, "Anna");
        map.put(2, "Daria");
        map.put(100, "Maxim");
        map.put(101, "Maxim");
        System.out.println(map);
        System.out.println(map.get(100));
        System.out.println(map.get(50));

        // both return String, therefore we can use .equals() method
        System.out.println(map.get(100).equals(map.get(101)));

        map.remove(1);
        System.out.println(map);
        map.put(1, "Kinga");
        System.out.println(map);
        map.put(35, "Miranda");
        map.put(105, "Kate");
        System.out.println(map);
        map.put(-2, "Nick");
        map.put(0, "Matt");
        System.out.println(map);
        System.out.println("map.containsKey(2) = " + map.containsKey(2));
        System.out.println("map.containsValue(\"Mathew\") = " + map.containsValue("Mathew"));

        for (Integer eachKey : map.keySet()) {
            System.out.println(eachKey + " - " +map.get(eachKey));
            if (map.get(eachKey).equals("Daria")) {
                System.out.println("This is our key = " + eachKey);
            }
        }
    }
}
