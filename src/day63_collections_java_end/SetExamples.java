package day63_collections_java_end;

import java.util.*;

public class SetExamples {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        // list -> ArrayList
        set.add(100);
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(2);
        set.add(56);

        // unordered, no duplicates, no indexes
        System.out.println(set);

        Set<String> words = new HashSet<>();
        words.add("hello");
        words.add("world");
        words.add("java");
        words.add("Selenium");
        words.add("collection");
        words.add("java");

        // convert your set to a list
        List<String> wordsList = new ArrayList<>(words);
        System.out.println(wordsList.get(1));
        wordsList.add("world");

        System.out.println(words);
        System.out.println(wordsList);
        System.out.println(wordsList.get(3));
        System.out.println(words.size());
        System.out.println(words.removeAll(words));
        System.out.println("Size after removing = " + words.size());


        Set<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("tomato");
        linkedHashSet.add("35");
        linkedHashSet.add("java");
        linkedHashSet.add("*&$");
        linkedHashSet.add("35");
        linkedHashSet.add("cucumber");
        linkedHashSet.add("java");
        System.out.println("linkedHashSet = " + linkedHashSet);

        Set<String> tree = new TreeSet<>();
        tree.add("tomato");
        tree.add("35");
        tree.add("java");
        tree.add("*&$");
        tree.add("35");
        tree.add("cucumber");
        tree.add("java");
        System.out.println("tree = " + tree);
        // ((TreeSet)tree).first(); -> downcasting
    }
}
