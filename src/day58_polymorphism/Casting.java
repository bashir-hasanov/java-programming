package day58_polymorphism;

public class Casting {
    public static void main(String[] args) {
        // variable of Worker and object of SuperMan
        Worker worker = new Superman();
        worker.work("QA Manager");
        worker.getPaid();

        // downcasting with child class
        ((Superman)worker).raiseKid();
        ((Superman)worker).feedKid();
        ((Superman)worker).playWithKId();

        //downcasting with parent class
        ((Father)worker).raiseKid();
        ((Father)worker).feedKid();
        ((Father)worker).playWithKId();

        Superman superMan = (Superman) worker;

    }
}
