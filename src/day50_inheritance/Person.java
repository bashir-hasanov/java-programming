package day50_inheritance;

/**
 * Super class
 * Parent class
 * Base class
 */

public class Person {
    String name;
    int age;
    public void walk() {
        System.out.println(name + " is walking");
    }

    public void talk() {
        System.out.println(name + " is walking");
    }

    public void work(String job) {
        System.out.println(name + " is working as a " + job);
    }
 }
