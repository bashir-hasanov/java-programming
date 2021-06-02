package day49_static;

public class StaticMethods {

    int num = 10;
    static int count = 5;

    public static void displayMessage(String message) {
        System.out.println("message = " + message);
        // System.out.println("num = " + num); --> ERROR: a non static (instance) variable
        // variable cannot be used in a static method
        System.out.println("count = " + count); // VALID: count is a static variable
    }

    public static void anotherStaticMethod() {
        System.out.println("another static method");
        displayMessage("Wooden spoon");
    }

    //StaticMethods stm = new StaticMethods();
    //stm.instanceMethod();
    public void instanceMethod() {
        System.out.println("an instance method");
        System.out.println("num = " + num);
        System.out.println("count = " + count);
        displayMessage("hello from instance method");
    }
}
