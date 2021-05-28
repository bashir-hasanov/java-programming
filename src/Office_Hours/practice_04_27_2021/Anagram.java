package Office_Hours.practice_04_27_2021;

import java.util.*;

public class Anagram {
    public static void main(String[] args) {

        System.out.println(isAnagram("listen", "silent"));
        System.out.println(isAnagram("abc", "cda"));

    }


    public static boolean isAnagram(String one, String two) {
        if (one.length() != two.length()) {
            return false;
        }
        one = one.toLowerCase();
        two = two.toLowerCase();

        int[] count = new int[26];

        for (int i = 0; i <one.length(); i++) {
            char letterFromOne = one.charAt(i);
            char letterFromTwo = two.charAt(i);

            count[letterFromOne - 97] = count[letterFromOne - 97] + 1;
            count[letterFromTwo - 97] = count[letterFromTwo - 97] - 1;
        }
        return Arrays.equals(count, new int[26]);
    }
}
