package day13_conditional_statements;

public class IfWithBooleanVariable {
    public static void main(String[] args) {
        boolean isHungry = false;

        // if (isHungry == true) --> longer way
        if (isHungry) {
            System.out.println("I am hungry. I will go get something to eat.");
            System.out.println("Then code java.");
        } else {
            System.out.println("I am not hungry.");
            System.out.println("I will keep coding java");
        }

        double price = 245.44;
        boolean isAffordable = price <= 200; //200 is budget
        System.out.println("isAffordable = " + isAffordable);
        if (isAffordable) {
            System.out.println("I can afford it.");
        } else {
            System.out.println("It is too expensive. Let`s keep coding Java.");
        }
        boolean isRemoteJob = false;
        // if it is not remote job, print:"Sorry, I am not interested."
        //otherwise, print:"Sure, I am interested. What is the interview process?"
        if (!isRemoteJob) {
            System.out.println("Sorry, I am not interested.");
        } else {
            System.out.println("Sure, I am interested. What is the interview process?");
        }
    }
}
