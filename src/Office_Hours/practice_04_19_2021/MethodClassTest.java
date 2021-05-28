package Office_Hours.practice_04_19_2021;

import Office_Hours.practice_04_19_2021.MethodClass;

import java.lang.reflect.Method;

public class MethodClassTest {
    public static void main(String[] args) {
        MethodClass.methodOne();
        System.out.println(MethodClass.methodTwo());

        String s = MethodClass.methodTwo();
        System.out.println(s);

        String s2 = "words";
        System.out.println(MethodClass.methodThree(s2));

        String s3 = "bashir.89";
        String s4 = "BHne0@1@*9";
        System.out.println(MethodClass.login(s3, s4));
    }
}
