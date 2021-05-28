package day42_arrayList;

import java.util.*;

public class UniqueFromList {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(Arrays.asList(2, 4, 4, 1, 5, 6));
        List<Integer> uniqueList = UniqueNumbers(nums);
        System.out.println("Unique list = " + uniqueList);


    }

    public static List<Integer> UniqueNumbers(List<Integer> nums) {
        //new arrayList to store only unique numbers
        List<Integer> uniqueList = new ArrayList<>();
        //loop through the list
        for (int each : nums) {
            if (Collections.frequency(nums, each) == 1) {
                System.out.println(each + " ");
                uniqueList.add(each);
            }
        }
        return uniqueList;
    }
}
