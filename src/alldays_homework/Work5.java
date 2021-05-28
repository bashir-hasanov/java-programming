package alldays_homework;
import java.util.Scanner;
public class Work5 {
    public static void main(String[] args) {
        System.out.println("Enter your age:");
        Scanner scan = new Scanner(System.in);
        int age = scan.nextInt();
        if (age >= 18) {
            System.out.println("You are eligible to vote.");
        } else {
            System.out.println("You are not eligible to vote.");
        }
    }
}
