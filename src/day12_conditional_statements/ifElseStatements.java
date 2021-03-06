package day12_conditional_statements;

public class ifElseStatements {
    public static void main(String[] args) {
        if (10 > 5) {
            System.out.println("Condition is true. It means 10 is greater than 5.");
        } else {
            System.out.println("Condition is false");
        }

        int count = 25;
        //check if count is more than 30. If yes, print : "Count is more than 30."
        //otherwise print: "Count is less than 30."
        if (count > 30) {
            System.out.println("Count is more than 30.");
        } else {
            System.out.println("Count is less than 30.");
        }

        byte age = 55;
        if (age >= 18) {
            System.out.println("You are eligible to vote.");
            System.out.println("Age is equal to or greater than 18.");
        } else {
            System.out.println("You are not eligible to vote.");
            System.out.println("Age is less than 18.");
        }

    }
}
