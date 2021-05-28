package day25_loop_continued;

public class PrintOddOrEvenNumbers {
    public static void main(String[] args) {
        for (int num1 = 1; num1 <= 100; num1 +=2) {
            System.out.println("num1 = " + num1);
        }

        for (int num2 = 2; num2 <= 100; num2 +=2) {
            System.out.println("num2 = " + num2);
        }


        System.out.println("EVEN NUMBERS FROM 0 TO 100");
        for (int n = 0; n <= 100; n++) {
            if (n % 2 == 0) {
                System.out.print(n + " ");
            }
        }

        System.out.println("\nODD NUMBERS FROM 0 TO 100");
        for (int m = 0; m <= 100; m++) {
            if (m % 2 != 0) {
                System.out.print(m + " ");
            }
        }
    }
}
