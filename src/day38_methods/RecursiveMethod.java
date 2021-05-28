package day38_methods;

public class RecursiveMethod {
    public static void main(String[] args) {
        oneToHundred(1);

    }

    public static void oneToHundred(int num) {
        System.out.print(num + " ");
        num++;
        if (num <= 100) {
            oneToHundred(num);
        }
    }
}
