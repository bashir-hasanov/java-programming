package Office_Hours.practice_07_12_2021;

public class PObjectTest {
    public static void main(String[] args) {
        PA obj1 = new PA();
        Object obj2 = new PA();
        obj1.go();
        // obj2.go(); -> ERROR: Object class has no access to method go();
        ((PA)obj2).go();

        PB obj3 = new PC();
        obj3.go();
        ((PC)obj3).math();
        ((PI)obj3).math();

        PB obj4 = new PB();
        obj4.go();
        ((PA)obj4).go();
        ((PI)obj4).math(); // ClassCastException
    }
}
