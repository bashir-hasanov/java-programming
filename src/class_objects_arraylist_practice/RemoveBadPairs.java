package class_objects_arraylist_practice;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveBadPairs {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(3, 4, 6, 1, 1, 10, 8, 7, 5, 13, 9, 3));
        System.out.println(removeBadPairs(nums));
    }

    public static ArrayList<Integer> removeBadPairs(ArrayList<Integer> nums) {
        for (int i = 0; i < nums.size(); i +=2) {
            if (nums.get(i) > nums.get(i+1)) {
                nums.remove(i);
                nums.remove(i);
            }
        }
        return nums;
    }
}
