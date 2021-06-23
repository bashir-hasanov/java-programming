package day56_abstraction.drivable;

public class DrivableTest {
    public static void main(String[] args) {
        Tesla model3 = new Tesla();
        model3.hi();
        model3.bye();
        model3.autoDrive();
        model3.transportPeople();
        model3.cost(25);
        model3.start();
        model3.stop();

        Plane plane = new Plane();
        plane.hi();
        plane.bye();
        plane.autoDrive();
        plane.cost(2500);
        plane.transportPeople();
        plane.start();
        plane.stop();
        plane.land();

        //Polymorphism: will learn next class
        SelfDrivable sd1 = new Plane();
        SelfDrivable sd2 = new Tesla();
    }
}
