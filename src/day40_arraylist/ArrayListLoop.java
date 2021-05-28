package day40_arraylist;
import java.util.*;
public class ArrayListLoop {
    public static void main(String[] args) {
        List <Integer> nums = new ArrayList<>(); //polymorphic way of declaring
        System.out.println(nums);
        System.out.println("size = " + nums.size());
        nums.add(34); nums.add(2); nums.add(311); nums.add(88); nums.add(12); nums.add(2);
        nums.add(33); nums.add(0); nums.add(-21); nums.add(223); nums.add(100); nums.add(7);
        System.out.println("nums = " + nums);
        nums.remove(0);
        System.out.println("nums = " + nums);
        //nums.remove(88) --> indexOutOfBoundException
        nums.remove(new Integer(88));
        System.out.println("nums = " + nums);

        //for loop - iterate through all values, then print
        for (int i = 0; i < nums.size(); i++) {
            System.out.print(nums.get(i) + " ");
        }

        System.out.println();

        //for each loop and print all values on the same line
        for (Integer num : nums) {
            System.out.print(num + " ");
        }
    }
}
