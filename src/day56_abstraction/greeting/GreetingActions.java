package day56_abstraction.greeting;

public class GreetingActions {
    public static void main(String[] args) {
        Greeting gt = new Azerbaijani();
        gt.hi();
        gt.bye();

        Azerbaijani az = new Azerbaijani();
        az.hi();
        az.bye();

        Japanese jp = new Japanese();
        jp.hi();
        jp.bye();

        gt = new Japanese();
        gt.hi();
        gt.bye();


    }
}
