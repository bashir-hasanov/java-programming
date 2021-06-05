package day50_inheritance;

public class InheritanceTest {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.name = "Bashir";
        p1.age = 32;
        p1.walk();
        p1.talk();
        p1.work("SDET");

        Teacher t1 = new Teacher();
        t1.teacherId = 1234;
        t1.teach("Java");
        t1.name = "Saim";
        t1.age = 29;
        t1.walk();
        t1.talk();
        t1.work("Instructor");
    }
}
