package class_objects_arraylist_practice;

import java.util.ArrayList;
import java.util.Arrays;

public class ReverseAll {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>(Arrays.asList("ted", "talk", "learn"));
        System.out.println(reverseAll(words));
    }

    public static ArrayList<String> reverseAll(ArrayList<String> words) {
        ArrayList<String> result = new ArrayList<>();

        for (String each : words) {
            String reverse = "";
            for (int i = each.length()-1; i >=0; i--) {
                reverse +=each.charAt(i);

            }
            result.add(reverse);
        }
        return result;
    }
}
