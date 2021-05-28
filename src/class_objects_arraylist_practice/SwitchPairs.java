package class_objects_arraylist_practice;

import java.util.ArrayList;
import java.util.Arrays;

public class SwitchPairs {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>(Arrays.asList("Cat", "hi", "now", "yes", "dog", "the"));
        System.out.println(switchPairs(words));
    }

    public static ArrayList<String> switchPairs(ArrayList<String> words ) {
        for (int i = 0; i < words.size(); i +=2) {
            String temp = words.get(i);
            words.set(i, words.get(i+1));
            words.set(i+1, temp);
        }
        return words;
    }
}
