package day47_constructors;

public class StudentObjects {
    public static void main(String[] args) {
        Student stud1 = new Student(); //runs no-args constructor
        Student stud2 = new Student(); //runs no-args constructor

        // constructor with params
        Student stud3 = new Student("Bashir");
        Student stud4 = new Student("Alihan");

        Student stud5 = new Student("Nasiba", 28);
        Student stud6 = new Student(33);
    }
}
