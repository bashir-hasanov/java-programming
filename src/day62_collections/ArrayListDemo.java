package day62_collections;
import java.util.*;
public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        //polymorphic way -> below two lines
        List<String> cities = new ArrayList<>();
        Collection<String> schools = new ArrayList<>();
        cities.add("McLean"); // add() method from Collection or List interface
        cities.add("Fairfax");
        cities.add("Vienna");
        cities.add("New York");
        System.out.println(cities);
        System.out.println("First city -> " + cities.get(0));
        System.out.println("Count of cities = " + cities.size());
    }

}
