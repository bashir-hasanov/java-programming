package day45_oop;

public class CoffeeTests {
    public static void main(String[] args) {
        Coffee myCoffee = new Coffee();

        System.out.println("coffee amount = " + myCoffee.getAmount());
        myCoffee.refill();
        System.out.println("amount after refill = " + myCoffee.getAmount());
        myCoffee.drink(35);
        System.out.println("amount after drinking 35 = " + myCoffee.getAmount());

        // NOT : myCoffee.type = "Turkish coffee"; INSTEAD using a method:
        myCoffee.setType("Espresso");
        System.out.println("type of coffee = " + myCoffee.getType());
        myCoffee.setType("Turkish coffee");
        System.out.println("My coffee now is = " + myCoffee.getType());
        // describe myCoffee - show all variable values
        System.out.println(myCoffee.toString());

        Coffee coffee2 = new Coffee();
        System.out.println("coffee2 type = " + coffee2.getType());
        coffee2.setType("Capuccino");
        System.out.println("coffee2 type after updating = " + coffee2.getType());

        Coffee coffee3 = new Coffee();
        coffee3.setType("Frapuccino");
        System.out.println("coffee3 type = " + coffee3.getType());

        // point to same object as coffee2
        coffee3 = coffee2;
        System.out.println("coffee3 type = " + coffee3.getType());

        Coffee coffee4 = null; //reference variable does not refer/point to any object in HEAP
        coffee4.setType("turkish"); //null pointer exception

    }
}
