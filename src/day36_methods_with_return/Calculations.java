package day36_methods_with_return;

public class Calculations {
    public static void main(String[] args) {
        System.out.println(Calculator.add(34134, 1441));
        System.out.println(Calculator.minus(432, 42));
        System.out.println(Calculator.multiply(345, 21));
        System.out.println(Calculator.divide(654, 2));

        double m1 = 234;
        double m2 = 90;
        System.out.println("234 + 90 = " + Calculator.add(m1, m2));
        System.out.println("234 - 90 = " + Calculator.minus(m1, m2));
        System.out.println("234 * 90 = " + Calculator.multiply(m1, m2));
        System.out.println("234 / 90 = " + Calculator.divide(m1, m2));

    }

}
