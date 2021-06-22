package day56_abstraction;

public class GreetingActions {
    public static void main(String[] args) {
        Greeting gt = new Azerbaijani();
        gt.hi();
        gt.bye();

        Azerbaijani az = new Azerbaijani();
        az.hi();
        az.bye();
    }
}
