package day31_arrays_continued;

import java.util.*;

public class BinarySearch {
    public static void main(String[] args) {
        int[] numbers = {23, 123, 654, 2344, 12345, 14421};
        System.out.println(Arrays.binarySearch(numbers, 23));
        System.out.println(Arrays.binarySearch(numbers, 123));
        System.out.println(Arrays.binarySearch(numbers, 14421));
        System.out.println(Arrays.binarySearch(numbers, 25));
        System.out.println(Arrays.binarySearch(numbers, 700));

        if (Arrays.binarySearch(numbers, 12345) > 0) {
            System.out.println("12345 is present in array");
        } else {
            System.out.println("12345 is not present in array");
        }




    }
}
