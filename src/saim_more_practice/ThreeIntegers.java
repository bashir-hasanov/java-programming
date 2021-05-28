package saim_more_practice;
import java.util.Scanner;
public class ThreeIntegers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter three numbers:");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int num3 = scan.nextInt();

        if (num1 == num2 && num2 == num3) {
            System.out.println("All integer are the same.");
        } else {
            if (num1 > num2 && num1 > num3) {
                System.out.println(num1 + " is the biggest value of the three numbers.");
            } else if (num2 > num1 && num2 > num3) {
                System.out.println(num2 + "  is the biggest value of the three numbers.");
            } else {
                System.out.println(num3 + " is the biggest value of the three numbers.");
            }
        }
    }
}
