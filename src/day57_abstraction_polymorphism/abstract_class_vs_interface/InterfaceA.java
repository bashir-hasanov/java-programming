package day57_abstraction_polymorphism.abstract_class_vs_interface;

   // Marker interface -> interface without any methods or variables.
public interface InterfaceA {

    // interfaces can have only PUBLIC access modifier for all variables and methods
    // interfaces can ONLY have PUBLIC STATIC FINAL variables
    public static final String TYPE = "interface";
    double MAX_COUNT = 500.0; // this is also 'public static final' automatically

       //public InterfaceA() {} -> ERROR: interface cannot have any constructors

    public abstract void absMethodB(int num);


    /**
     *Starting from Java 8 (jdk 1.8)
     * interface can have static and default methods
     * Before Java 8 interface was pure abstraction - only abstract methods were allowed
     * public abstract is automatically added, so it is optional to type it
     * Starting from Java 8 static and default methods are allowed in interfaces
     */
    public static void staticMethodE(String str) {
        System.out.println("staticMethodE is called with str - " + str);
    }

    /*
    default method is a method with a body in interface
    we have to type 'default' keyword, otherwise Java will assume it is an abstract method
     */
    public default void defaultMethodF() {
        System.out.println("defaultMethodF is called");
    }
}
