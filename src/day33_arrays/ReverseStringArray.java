package day33_arrays;
import java.util.*;
public class ReverseStringArray {
    public static void main(String[] args) {
        String[] words = {"java", "html", "js", "ruby", "css"};
        System.out.println("before reverse words = " + Arrays.toString(words));
        for (int i = 0, j = words.length-1; i < words.length/2; i++, j--) {
            String temp = words[i];
            words[i] = words[j];
            words[j] = temp;
        }
        System.out.println("after reverse words = " + Arrays.toString(words));
    }
}
