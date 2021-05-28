package java_interview_tasks;

import java.lang.reflect.Array;
import java.util.Arrays;

public class StringSameLetters {
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
