package day38_methods;

import java.util.Arrays;

public class ArrayUtils {

    public static void printArray (int[] nums) {
        System.out.println(Arrays.toString(nums));
    }

    public static int sum (int[] nums) {
        int sum = 0;
        for ( int num : nums) {
            sum += num;
        }
        return sum;
    }

    public static boolean contains (int[] nums1, int num) {

        for (int each : nums1) {
            if (num == each) {
                return true;
            }
        }
        return false;
    }

    public static boolean equals (int[] numbers1, int[] numbers2) {
        boolean check = false;
        if (Arrays.equals(numbers1, numbers2)) {
            check = true;
        }
         return check;
    }
}
