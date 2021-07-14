package day62_collections;
import java.util.*;
public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<String> friends = new LinkedList<>();
        // polymorphic way
        List<Integer> scores = new LinkedList<>();
        scores.add(87);
        scores.add(42);
        scores.add(5);
        scores.add(87);
        System.out.println(scores);
        System.out.println("First score = " + scores.get(0));
        System.out.println("Second score = " + scores.get(1));
        System.out.println("Count of scores = " + scores.size());

        friends.add("Mahliya");
        friends.add("Nevzat");
        friends.add("Gurban");
        friends.add("Suleyman");
        System.out.println(friends);
        System.out.println("Last in the list: " + friends.getLast());
    }
}
