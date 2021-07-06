package java_interview_tasks;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Write a return method that check if a string is build out of the same letters as another string.
 * Ex:  same("abc",  "cab"); -> true
 * same("abc",  "abb"); -> false:
 */

public class StringSameLetters02 {
    public static void main(String[] args) {

        System.out.println("Same letters? -> " + sameLetters("abshirnsaahvo", "bashirhasanov"));
    }

    public static boolean sameLetters (String a, String b) {
        char[] one = a.toCharArray();
        char[] two = b.toCharArray();
        Arrays.sort(one);
        Arrays.sort(two);
        if (Arrays.equals(one, two)) {
            return true;
        }
        return false;
    }
}
