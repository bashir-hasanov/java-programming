package day39_wrapper_classes;

public class AutoboxingUnboxing {
    public static void main(String[] args) {

        //auto-boxing
        int num1 = 500;
        Integer num2 = num1;

        Integer num3 = 234;
        System.out.println(num3.toString());
        System.out.println(num2.toString());

        //unboxing
        Double d1 = new Double(100.5);
        double d2 = d1;

    }
}
