package day42_arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MethodWithList {
    public static void main(String[] args) {
        /**
         * methodName: printStrList
         * param: List of Strings
         * return: void
         * prints all values separated by space in same line
         */
        List<String> str = new ArrayList<>(Arrays.asList("java", "ruby", "php", "c++", "javascript"));
        printStrList(str);

        List<Integer> numbers = new ArrayList<>(Arrays.asList(45, 907, 6, -23, 0, 24, 1, 1512));
        System.out.println("\nSum of integers = " + sumIntegerList(numbers));
    }

    public static void printStrList (List<String> words) {
            for (String each : words) {
                System.out.print(each + " ");
            }
            }

    /**
     * method:sumInt
     * param: List of integers
     * returns int
     */

    public static int sumIntegerList (List<Integer> nums) {
        int sum = 0;
        for (int each : nums) {
            sum += each;

        }
        return sum;

    }
}

