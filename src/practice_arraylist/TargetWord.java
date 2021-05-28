package practice_arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class TargetWord {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>(Arrays.asList("java", "html", "javascript", "java", "word"));
        String targetWord = "java";

        int count = 0;

        for (String each : words) {
            if (each.equals(targetWord)) {
                count++;
            }
        }
        System.out.println(targetWord + " was found " + count + " times");
    }
}
