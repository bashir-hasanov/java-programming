package day55_abstraction_interface.exercise.interface_demo;

/**
 * interface keyword is used to create an interface in java.
 * unlike abstract class, it is implemented, not extended by sub-class
 * class can implement multiple interfaces at the same time
 * interface cannot be instantiated as well -> you can not create object from interface
 */

public interface MyInterface {
    public abstract void learn();
}


class MyClass implements MyInterface {

@Override
    public void learn() {
    System.out.println("Learning in MyClass");
}
}


class Main {
    public static void main(String[] args) {
        //MyInterface myInterface = new MyInterface(); -> ERROR: cannot be instantiated
        MyClass myClass = new MyClass();
    }
}
