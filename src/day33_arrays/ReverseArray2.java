package day33_arrays;
import java.util.*;
public class ReverseArray2 {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 30;
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);

        int temp = num1;
        num1 = num2;
        num2 = temp;
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);

        int[] nums = {5, 10, 4, 100};
        System.out.println("Before swap - " + Arrays.toString(nums));

        for (int i = 0, j =nums.length-1; i < nums.length/2; i++, j--) {
            int tempNum = nums[i];
            nums[i] = nums[j];
            nums[j] = tempNum;
        }
        System.out.println("After swap - " + Arrays.toString(nums));
    }
}
