package day37_methods_overloading;

public class MethodOveloading {
    public static void main(String[] args) {
        System.out.println(sum(43, 25));
        System.out.println(sum(10.5, 3.5));
        System.out.println(sum(475, 213, 587));
        System.out.println(sum("John Smith", "Jane Smith"));
        summ(45, 68);
        summ(85, 217, 36);
        summ(452.3, 52.32);
        summ("Hello", "World");
    }

    public static void summ (int num1, int num2) {
        System.out.println("sum(int num1, int num2)");
        System.out.println("Result = " + (num1 + num2));
    }

    public static void summ (int num1, int num2, int num3) {
        System.out.println("sum(int num1, int num2, int num3)");
        System.out.println("Result = " + (num1 + num2 + num3));
    }

    public static void summ (double num1, double num2 ) {
        System.out.println("sum(double num1, double num2)");
        System.out.println("Result = " + (num1 + num2));
    }

    public static void summ (String num1, String num2) {
        System.out.println("sum(String num1, String num2)");
        System.out.println("Result = " + (num1 + " " + num2));
    }

    public static int sum(int num1, int num2) {
        return num1 + num2;
    }

    public static double sum(double num1, double num2) {
        return 2 * (num1 + num2) - num1 * num2;
    }

    public static int sum (int num1, int num2, int num3) {
        return num1 + num2 + num3;
    }

    public static String sum(String word1, String word2) {
        return word1 + " and " + word2;
    }
}
