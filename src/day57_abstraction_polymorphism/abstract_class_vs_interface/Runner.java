package day57_abstraction_polymorphism.abstract_class_vs_interface;

public class Runner {
    public static void main(String[] args) {

        // We cannot create object neither of them (abstract class & interface)
        // AbstractA absA = new AbstractA(); -> ERROR: Cannot create object
        // InterfaceA intA = new InterfaceA(); -> ERROR: Cannot create object
        InterfaceA.staticMethodE("wooden spoon");
        //ConcreteA.staticMethodE("hello"); -> staticMethodE() only works with interface


    }
}
