package saim_problem_set_1;

public class Operators {
    public static void main(String[] args) {
        int a=3, b=2;
        long c = (a-- + b) * 2 / 3 % 2;
        System.out.println("a = " + a);  //2
        System.out.println("b = " + b);  //2
        System.out.println("c = " + c);  //1

        int num1 = 10;
        int num2 = num1++ * 3 + ++num1 + num1++ % 2;
        System.out.println("num1 = " + num1); // 13
        System.out.println("num2 = " + num2); //42
        int biggest = (num1 > num2 ) ? num1 : num2;
        System.out.println("biggest = " + biggest);

    }
}
