package day61_exceptions_collections;

import day55_abstraction_interface.exercise.Lifting;

import java.util.ArrayList;
import java.util.List;

public class ErrorExamples {
    public static void main(String[] args) {

        try {
            myMethod();
        } catch (StackOverflowError error) {
            System.out.println("StackOverFlowError happened");
        }
        System.out.println("After error");

        List<Integer> nums = new ArrayList<>();
        while (true) {
            nums.add(100);
        }
    }

    static int counter = 0;
    public static void myMethod() {
        System.out.println(counter++);
        myMethod();
    }
}
