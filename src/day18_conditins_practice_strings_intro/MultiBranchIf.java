package day18_conditins_practice_strings_intro;
import java.util.Scanner;
public class MultiBranchIf {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number:");
        int number = scan.nextInt();
        if (number > 0) {
            System.out.println("Number " + number + " is positive.");
        } else if (number < 0) {
            System.out.println("Number " + number + " is negative.");
        } else {   // } else if (number == 0) {
            System.out.println("Number " + number + " is zero");
        }
    }
}
