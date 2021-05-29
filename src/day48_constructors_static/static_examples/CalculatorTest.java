package day48_constructors_static.static_examples;

public class CalculatorTest {
    public static void main(String[] args) {

        Calculator.add(234,578);

        //Calculator.multiply(23, 4); --> ERROR: because the method multiply is not static
        // we will need to create an object/instance
        Calculator calc1 = new Calculator();
        calc1.multiply(23, 4);

        //static method can also be called by using an object
        calc1.add(457, 235);
    }
}
