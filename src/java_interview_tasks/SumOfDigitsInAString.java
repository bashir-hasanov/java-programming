package java_interview_tasks;

public class SumOfDigitsInAString {
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
