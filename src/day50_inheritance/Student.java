package day50_inheritance;

public class Student extends Person {
    double studentGpA;

    public void studies(String book) {
        System.out.println(name + " studies " + book);
    }
}
