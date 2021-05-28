package day33_arrays;
import java.util.*;
public class SplitReview {
    public static void main(String[] args) {
        String word = "java";
        String[] array = word.split("a");
        System.out.println(array.length);
        System.out.println(array.length-1);
        int countOfA = array.length-1;
        if (word.endsWith("a")) {
            countOfA++;
        }
        System.out.println("count of 'a' = " + countOfA);
        //never use this approach to count characters.

        String[] wordArr = word.split("");
        System.out.println(wordArr[0]);
        System.out.println(wordArr[1]);
        System.out.println(wordArr[2]);
        System.out.println(wordArr[3]);

        String word2 = "java1html23569sql";
        String[] word2Arr = word2.split("\\d");
        System.out.println(Arrays.toString(word2Arr));
    }
}
