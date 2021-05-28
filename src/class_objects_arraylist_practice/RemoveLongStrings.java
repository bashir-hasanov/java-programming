package class_objects_arraylist_practice;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveLongStrings {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>(Arrays.asList("one", "two", "three", "four", "five", "six", "seven"));
        System.out.println(removeShort(words, 4));
    }


    public static ArrayList<String> removeShort(ArrayList<String> words, int num) {
        ArrayList<String> result = new ArrayList<>();
        for (String each : words) {
            if (each.length() >= num) {
                result.add(each);
            }
        }
        return result;
    }
}
