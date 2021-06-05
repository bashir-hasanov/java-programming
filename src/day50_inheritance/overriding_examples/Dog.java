package day50_inheritance.overriding_examples;

public class Dog extends Animal {
    public void run() {
        System.out.println(name + " is running");
    }

    @Override
    public void speak() {
        System.out.println("Dog is saying HAWV-HAWV");
    }
}
