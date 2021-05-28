package saim_arrays_practice;
import java.util.*;
public class MaxMinNumber {
    public static void main(String[] args) {
        int[] nums = {342, 25, -45, 122, 67, 451, 1284, 78, 12, 4, 98, 1, 251};
        int maximumNumber = nums[0];
        int minimumNumber=nums[0];

        for (int eachNum : nums) {
            if (eachNum > maximumNumber) {
                maximumNumber = eachNum;
            }
            if (eachNum < minimumNumber) {
                minimumNumber = eachNum;
            }
        }

        System.out.println("Minimum Number = " + minimumNumber);
        System.out.println("Maximum Number = " + maximumNumber);
    }
}
