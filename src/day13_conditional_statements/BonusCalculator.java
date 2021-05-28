package day13_conditional_statements;

public class BonusCalculator {
    public static void main(String[] args) {
        double salesAmount = 5000;
        int bonus;
        if (salesAmount <= 1000) {
            bonus = 50;
            System.out.println("Good job! You are qualified for bonus.");
        } else {
            bonus = 100;
            System.out.println("Great job! You are qualified for full bonus.");
        }
        System.out.println("Your bonus for " + salesAmount + " is $" + bonus);
    }
}
