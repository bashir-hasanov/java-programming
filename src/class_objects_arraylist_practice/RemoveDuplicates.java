package class_objects_arraylist_practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class RemoveDuplicates {
    public static void main(String[] args) {
        ArrayList<Integer> nums= new ArrayList<>(Arrays.asList(1, 3, 5, 1, 4, 5, 9));
        System.out.println(removeDuplicates(nums));
        System.out.println(removeDup(nums));

    }

    public static ArrayList<Integer> removeDuplicates(ArrayList<Integer> nums) {
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0; i < nums.size(); i++) {
            int count = 0;
            for (int j = 0; j < nums.size(); j++) {
                if(nums.get(j) == nums.get(i)) {
                    count++;
                }
            }
            if (count == 1) {
                result.add(nums.get(i));
            }
        }
        return result;
    }

    public static ArrayList<Integer> removeDup (ArrayList<Integer> list) {
        list.removeIf(e -> Collections.frequency(list, e) > 1);
        return list;
    }
}
