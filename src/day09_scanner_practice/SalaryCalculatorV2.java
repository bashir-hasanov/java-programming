package day09_scanner_practice;
import java.util.Scanner;
public class SalaryCalculatorV2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter hourly rate");
        double hourlyRate = scan.nextDouble();
        double weeklyPay = hourlyRate * 40;
        double monthlyPay = weeklyPay * 52 / 12;
        double annualPay = weeklyPay * 52;

        System.out.println("Weekly pay:\t\t$" + weeklyPay);
        System.out.println("Monthly pay:\t$" + monthlyPay);
        System.out.println("Annual pay:\t\t$" + annualPay);

    }
}
