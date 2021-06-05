package day50_inheritance.overriding_examples;

public class Cat extends Animal {

    public void jump() {
        System.out.println(name + " is jumping");
    }

    @Override
    public void speak() {
        System.out.println("Cat is saying MEOWWW");
    }
}
