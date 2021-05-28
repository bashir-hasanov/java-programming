package practice_03_22_2021;

public class OperatorsExample {
    public static void main(String[] args) {
        int a = 3, b = 2;
        long c = (a-- + b) * 2 / 3 % 2;
        System.out.println("c = " + c);
    }
}
