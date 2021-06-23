package day56_abstraction.drivable;

import day56_abstraction.greeting.Greeting;

public class Plane extends Transportation implements SelfDrivable, Greeting {

    @Override
    public void transportPeople() {
        System.out.println("Plane transports people on the air");
    }

    @Override
    public void cost(int mile) {
        System.out.println("Plane costs $" + (mile * 2.5) + " to fly " + mile + " miles");
    }

    @Override
    public void autoDrive() {
        System.out.println("Plane has auto-pilot function");
    }

    @Override
    public void hi() {
        System.out.println("Plane says 'Hi'");
    }

    @Override
    public void bye() {
        System.out.println("Plane says 'Bye'");
    }

    public void land() {
        System.out.println("When plane arrives in destination, it lands");
    }
}
