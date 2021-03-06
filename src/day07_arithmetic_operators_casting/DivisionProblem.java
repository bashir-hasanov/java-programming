package day07_arithmetic_operators_casting;

public class DivisionProblem {
    public static void main(String[] args) {
        System.out.println(10 / 3);  //3
        System.out.println(5 / 2);   //2

        int num1 = 40, num2 = 15;
        System.out.println(num1 / num2);  //2

        System.out.println(5.0 / 2.0);    //2.5
        System.out.println(5.0 / 2);      //2.5
        System.out.println(5 / 2.0);      //2.5

        double d1 = 12, d2 = 5;
        System.out.println(d1 / d2);      //2.4

        int count1 = 100;
        double count2 = 30;
        System.out.println(count1 / count2);  //3.3333333333333335


    }
}
