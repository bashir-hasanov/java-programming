package day43_list_custom_classes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MethodsWithListReturn {
    public static void main(String[] args) {
        System.out.println(System.nanoTime());
//        System.out.println(getIntegerList());
//
//        List<Integer> mlnNums = getIntegerList();
//        System.out.println(mlnNums);
//
//        int[] mlnNumbers = getIntegerArray();
//        System.out.println(Arrays.toString(mlnNumbers));

        /**
         * getIntegerList
         * return List<Integer>
         * loop from 0 to 1M
         */
    }

    public static List<Integer> getIntegerList() {
        List<Integer> nums = new ArrayList<>();
        for (int i = 0; i <= 1000000; i++) {
            nums.add(i);
        }
        return nums;
    }

    public static int[] getIntegerArray() {
        int[] numbers = new int[1_000_001];
        for (int i = 0; i <= 1_000_000; i++) {
            numbers[i] = i;
        }
        return numbers;
    }
}
