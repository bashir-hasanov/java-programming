package saim_more_practice;
import java.util.Scanner;
public class MonthDays {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number for month:");
        int month = scan.nextInt();

        if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
            System.out.println("31");
        } else if (month == 4 || month == 6 || month == 9 || month == 11) {
            System.out.println("30");
        } else if (month == 2) {
            System.out.println("28");
        } else {
            System.out.println("Invalid input.");
        }
    }
}
