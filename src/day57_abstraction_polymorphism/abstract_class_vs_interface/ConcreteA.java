package day57_abstraction_polymorphism.abstract_class_vs_interface;
    /*
   Class can extend only 1 abstract class
   Class can implement multiple interfaces
   First non-abstract child class of Abstract class is called concrete class
    */
public class ConcreteA extends AbstractA implements InterfaceA, InterfaceB {


    // Concrete sub class must override abstract methods from abstract class or interface
        @Override
        public void absMethodA() {
            System.out.println("absMethodA implementation is called");
        }


        // Sub-class can override non-final methods from parent class
        @Override
        public void methodB() {
            System.out.println("methodB overridden version is called");
        }


        //@Override -> static methods are hidden
        public static void staticMethodC() {
            System.out.println("staticMethodC hidden version is called");
        }

        @Override
        public void absMethodB(int num) {
            System.out.println("absMethodB overridden version is called " + num);
        }
    }
