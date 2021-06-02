package day49_static;

public class StaticTest {
    String word = "java";
    static String word1 = "java";
    public static void main(String[] args) {
        // 1. static method can be called by using className
        StaticMethods.displayMessage("Wooden spoon");

        //1. instance method needs an object to be called
        // StaticMethods.instanceMethod(); --> ERROR: need to create an object
        StaticMethods stm = new StaticMethods();
        stm.instanceMethod();

        //2. static method can only access other static variables and methods
        //System.out.println(word); --> ERROR
        System.out.println(word1); //it is working
    }
}
