package java_interview_tasks;

/**
 * Write a method that can return the sum of the digits in a string
 */

public class SumOfDigitsInAString08 {
    public static void main(String[] args) {

        System.out.println("Sum of digits = " + sumOfDigits("Gr3kh9Kh8Hd92Ok8hJ7"));

    }

    public  static int  sumOfDigits(String s) {

        int total = 0;

        char[] ch =  s.toCharArray();

        for(char each: ch) {

            if(Character.isDigit(each)) {

                total += Integer.valueOf(""+each);

            }

        }

        return total;

    }
}
