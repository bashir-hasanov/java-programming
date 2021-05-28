package day36_methods_with_return;

public class Calculator {
    public static void main(String[] args) {
        System.out.println("Sum of numbers = " + add(321.4, 8479.23));
        double sum = add(12.5, 4.3);
        System.out.println("12.5 + 4.3 = " + sum);

        System.out.println("Subtraction = " + minus(409.2, 937631.23));

        System.out.println("Multiplication = " + multiply(134.2, 42.1));

        System.out.println("Division = " + divide(40, 5));
    }


    public static double add(double num1, double num2) {
        double sum = num1 + num2;
        return sum;
    }

    public static double minus(double num1, double num2) {
        double result = num1 - num2;
        return result;
    }

    public static double multiply(double num1, double num2) {

        return num1 * num2;
    }

    public static double divide(double num1, double num2) {
        double result = num1 / num2;
        return result;
    }
}
