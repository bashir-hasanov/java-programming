package day37_methods_overloading;

public class OverloadMain {
    public static void main(String[] names) {
        System.out.println("Hello From Real Main Method");
        main(10, 56);
        main("Yalguzag");
    }

    public static void main(String words) {
        System.out.println("The word is - " + words);
    }

    public static void main(int num1, int num2) {
        System.out.println("main method with 2 int = " + (num1 + num2));
    }
}
