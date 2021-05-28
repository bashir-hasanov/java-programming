package day31_arrays_continued;
import java.util.*;
public class ArraysUtil {
    public static void main(String[] args) {
        int[] nums = {100, 5, 1, 7, 0, -4, 46, 32, 21, 70};
        System.out.println(Arrays.toString(nums));
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        System.out.println("minimum value - " + nums[0]);
        System.out.println("maximum value -  " + nums[nums.length-1]);

        String[] words = {"java", "python", "php", "ruby", "javascript"};
        System.out.println(Arrays.toString(words));
        System.out.println("[" + String.join(", ", words) + "]");
        Arrays.sort(words);
        System.out.println(Arrays.toString(words));

        // sort words in reverse order

        Arrays.sort(words, Collections.reverseOrder());
        System.out.println(Arrays.toString(words));


    }
}
