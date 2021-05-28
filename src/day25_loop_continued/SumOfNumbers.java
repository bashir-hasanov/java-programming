package day25_loop_continued;

public class SumOfNumbers {
    public static void main(String[] args) {
        int sum =0;
        for (int num = 1; num <=10; num++) {
            System.out.println(num);
            sum = sum + num;
        }
        System.out.println("sum = " + sum);
    }
}
