package saim_loop_practice;
import java.util.*;
public class MaxMinNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number:");
        int first = scan.nextInt();
        int max = first;
        int min = first;

        for (int i = 0; i < 4; i++) {
            System.out.println("Enter a number:");
            int num = scan.nextInt();

            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }
        System.out.println("Minimum number - " + min);
        System.out.println("Maximum number - " + max);

    }
}
