package day18_conditins_practice_strings_intro;
import java.util.Scanner;
public class ThreeNumbera {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter num1:");
        int num1 = scan.nextInt();
        System.out.println("Enter num2:");
        int num2 = scan.nextInt();
        System.out.println("Enter num3:");
        int num3 = scan.nextInt();
        if (num1 > num2 && num1 > num3) {
            System.out.println(num1 + " is maximum number.");
        } else if (num2 > num1 && num2 > num3) {
            System.out.println(num2 + " is maximum number.");
        } else {
            System.out.println(num3 + " is maximum number.");
        }
    }
}
