package saim_loop_practice;

public class OddNumbersSum {
    public static void main(String[] args) {
        int sum = 0;
        for (int num = 1; num <= 100; num++) {
            if (num % 2 != 0) {
                sum += num;
            }
        }
        System.out.println("Sum of odd numbers between 1 and 100 equals to " + sum);
    }
}
