package day50_inheritance;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StaticBlockDemo {
    static int num;
    static List<String> carModels;
    static {
        System.out.println("static initializer block");
        num = 10;
        carModels = new ArrayList<>();
        carModels.addAll(Arrays.asList("Ford", "Honda", "Toyota", "BMW", "Mercedes-Benz"));
    }

    public StaticBlockDemo() {
        System.out.println("No-ARGS constructor");
        num += 5;
    }

    public StaticBlockDemo(int value) {
        System.out.println("value = " + value);
        value +=num;
    }

}
