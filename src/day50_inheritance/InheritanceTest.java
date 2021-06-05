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
        t1.name = "Saim";
        t1.teach("Java");
        t1.age = 29;
        t1.walk();
        t1.talk();
        t1.work("Instructor");

        Student st1 = new Student();
        st1.studentGpA = 3.87;
        st1.name = "Suleyman";
        st1.studies("Zoology");
        st1.age = 27;
        st1.talk();
        st1.walk();
        st1.work("Library Assistant");
    }
}
