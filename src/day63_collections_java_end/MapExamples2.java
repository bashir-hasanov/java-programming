package day63_collections_java_end;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapExamples2 {
    public static void main(String[] args) {
        // id, person
        Map<Integer, Person> map = new HashMap<>();
        map.put(32, new Person("MJ", 32));
        map.put(10, new Person("Nick", 10));
        map.put(null, new Person(null, 0));

        System.out.println(map.get(32));
        System.out.println(map.get(31));
        System.out.println(map.get(null));

        Map<Integer, Person> map2 = new LinkedHashMap<>();
        map2.put(null, new Person(null, 0));
        map2.put(10, new Person("Nick", 10));
        map2.put(32, new Person("MJ", 32));

        Map<Integer, Person> map3 = new TreeMap<>();
        map3.put(32, new Person("MJ", 32));
        map3.put(0, new Person("", 0));
        map3.put(10, new Person("Nick", 10));

        System.out.println(map);
        System.out.println(map2);
        System.out.println(map3);
    }
}
