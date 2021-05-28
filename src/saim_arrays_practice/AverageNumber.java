package saim_arrays_practice;

public class AverageNumber {
    public static void main(String[] args) {
        int[] nums = {10, 15, 5, 6, 24, 100, 82, 12, 30, 36};
        int sum = 0;
        int average = 0;
        for (int eachNum : nums) {
            sum += eachNum;
            average = sum / nums.length;
        }

        System.out.println("average = " + average);
    }
}
