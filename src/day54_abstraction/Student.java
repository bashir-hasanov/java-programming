package day54_abstraction;

/**
 * -> we add abstract keyword to a class to make it an abstract class
 * -> we cannot create object of Student class - meaning:
 *   Student student = new Student(); --> will show ERROR
 * -> what can we do with this Student class? We can extend this class
 * by creating OnlineStudent sub-class
 */

public abstract class Student {

    public void code(String language) {
        System.out.println("Student is coding using " + language);
    }

    public abstract void attendClass();
}



// below is a sub-class of Student class
class OnlineStudent extends Student {

    // attendClass abstract method is implemented by the sub-class
    // sub-class is overriding the abstract method of Parent class
    @Override
    public void attendClass() {
        System.out.println("Student is attending class using Zoom");
    }
}



class School {
    public static void main(String[] args) {
        Student student = new OnlineStudent();
        student.code("Java");
        student.attendClass();

    }
}
