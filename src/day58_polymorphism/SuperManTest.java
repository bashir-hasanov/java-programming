package day58_polymorphism;

public class SuperManTest {
    public static void main(String[] args) {
        Father spMan1 = new Superman();
        spMan1.playWithKId();
        spMan1.feedKid();
        spMan1.raiseKid();
        // spMan1.work("SDET"); -> ERROR: spMan1 is Father data type, can only access methods in Father
        // System.out.println(spMan1.getPaid()); -> ERROR: spMan1 is Father data type, can only access methods in Father

        Worker spMan2 = new Superman();
        spMan2.work("QA Manager");
        System.out.println("Got paid $" + spMan2.getPaid());
        /*
        spMan2.playWithKid(); -->
        spMan2.feedKid();     --> ERROR: spMan2 is Worker data type, can only access methods in Worker
        spMan2.raiseKid();    -->
         */

        Superman spMan3 = new Superman();
        spMan3.playWithKId();
        spMan3.feedKid();
        spMan3.feedKid();
        spMan3.work("SDET");
        System.out.println("Waiting for payment $" + spMan3.getPaid());
    }
}
