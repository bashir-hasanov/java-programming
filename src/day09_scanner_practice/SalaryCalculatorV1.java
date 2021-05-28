package day09_scanner_practice;

public class SalaryCalculatorV1 {
    public static void main(String[] args) {
        System.out.println("Enter hourly rate:");
        double hourlyRate = 50.0;
        double weeklyPay = 40 * hourlyRate;
        double monthlyPay = weeklyPay * 52 / 12;
        double annualPay = 52 * weeklyPay;

        System.out.println("Weekly pay: $" + weeklyPay);
        System.out.println("Monthly pay: $" + monthlyPay);
        System.out.println("Annual pay: $" + annualPay);
    }
}
