package day12_conditional_statements;


public class ComparisonExamples {
    public static void main(String[] args) {
        int currentSpeed, speedLimit;
        boolean isSpeeding;
        System.out.println("Your current speed:");
        currentSpeed = 45;
        speedLimit = 55;
        isSpeeding = currentSpeed > speedLimit;
        System.out.println("Are you speeding? - " + isSpeeding);
        System.out.println("speedLimit = " + speedLimit);
        System.out.println("currentSpeed = " + currentSpeed);

        double accountBalance = 250.25;
        double itemPrice = 100.99;
        System.out.println("Can I afford? - " + (accountBalance >= itemPrice)); //true

        boolean canAfford = accountBalance >= itemPrice;
        System.out.println("Can I afford it " + canAfford);

        accountBalance = accountBalance - itemPrice;
        accountBalance -= itemPrice;
        boolean isBroke = accountBalance <= 0;
        System.out.println("Am I broke = " + isBroke);
 }
}