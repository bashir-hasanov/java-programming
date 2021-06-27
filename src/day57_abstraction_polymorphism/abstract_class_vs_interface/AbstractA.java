package day57_abstraction_polymorphism.abstract_class_vs_interface;

public abstract class AbstractA {

    // Abstract class can have instance variables, static variables with all access modifiers
    int num1;
    private double price;
    public static int count;
    public final String TYPE = "abstract";
    public static final String LANGUAGE = "Java";

    //Abstract classes can have constructors
    public AbstractA() {
        System.out.println("AbstractA constructor");
    }

    // Abstract class can have abstract, non-abstract and static methods
    // abstract method cannot be private, static or final
    // variables, instance and static methods (non-abstract) can use all access modifiers
    public abstract void absMethodA();

    public void methodB() {
        System.out.println("methodB called");
    }

    public static void staticMethodC() {
        System.out.println("Static methodC is called");
    }
}
