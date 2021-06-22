package day56_abstraction;

public class Azerbaijani implements Greeting {

    @Override
    public void hi() {
        System.out.println("Salam");
    }

    @Override
    public void bye() {
        System.out.println("Sağ ol");
    }
}
