package day59_polymorphism_exceptions.exception_handling;

public class RuntimeErrorExample {
    public static void main(String[] args) {
        System.out.println(10 / 2);

        // RuntimeException happens in below code, it throws ArithmeticException -> RuntimeErrorExample
        System.out.println(10 / 0);

        System.out.println(10 / 3);
    }
}
