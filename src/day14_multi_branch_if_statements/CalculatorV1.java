package day14_multi_branch_if_statements;

public class CalculatorV1 {
    public static void main(String[] args) {
        double num1 = 5.5, num2 = 12.7;
        char operator = '-';
        if (operator == '+') {
            System.out.println("result: " + (num1 + num2));
        } else if (operator == '-') {
            System.out.println("result: " + (num1 - num2));
        } else if (operator == '*') {
            System.out.println("result: " + num1 * num2);
        } else if (operator == '/') {
            System.out.println("result: " + num1 / num2);
        }
    }
}
