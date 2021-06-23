package day56_abstraction.drivable;

import day56_abstraction.greeting.Greeting;

public class Tesla extends Transportation implements SelfDrivable, Greeting {

    @Override
    public void transportPeople() {
        System.out.println("Tesla transports people on the roads");
    }

    @Override
    public void cost(int mile) {
        System.out.println("Tesla costs $" + (mile * 0.1) + " to drive " + mile + " miles");
    }

    @Override
    public void autoDrive() {
        System.out.println("Tesla has auto-drive function");
    }

    @Override
    public void hi() {
        System.out.println("Tesla says 'Hi'");
    }

    @Override
    public void bye() {
        System.out.println("Tesla says 'Bye'");
    }
}
