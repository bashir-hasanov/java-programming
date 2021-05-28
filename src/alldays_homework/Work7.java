package alldays_homework;
import java.util.Scanner;
public class Work7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the value for angleA:");
        int angleA = scan.nextInt();
        System.out.println("Enter the value for angleB:");
        int angleB = scan.nextInt();
        System.out.println("Enter the value for angleC:");
        int angleC = scan.nextInt();
        int sum = angleA + angleB + angleC;
        if (sum == 180) {
            System.out.println("This is a valid triangle");
        } else {
            System.out.println("This is not a valid triangle.");
        }
    }
}
