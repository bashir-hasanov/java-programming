package day15_logicalops_switch_ternary;

public class NotLogicalOperator {
    public static void main(String[] args) {
        int apples = 5;
        System.out.println(!(apples >3));
        System.out.println(!(apples < 2));
        System.out.println("!true = " + !true);
        System.out.println("!false = " + !false);

        int age = 8;
        if (!(age > 7)) {
            System.out.println("Need to sit in child car seat. Age = " + age);
        } else {
            System.out.println("Can sit in normal passenger seat. Age = " + age);
        }

        boolean isSmokingAllowed = true;
        if (!isSmokingAllowed) {
            System.out.println("You are not allowed to smoke here. Exit!");
        } else {
            System.out.println("This is dedicated smoking area.");
        }

        boolean isAffordable = true;
        if (!isAffordable) {
            System.out.println("The item is not affordable.");
        } else {
            System.out.println("It is affordable.");
        }

        String carModel = "Tesla";
        // if it is not tesla, I am not interested.
        if (!carModel.equals("Tesla")) {
            System.out.println("I am not interested in " + carModel);
        } else {
            System.out.println("I am interested, as it is " + carModel);
        }
        String secretPassword = "ABC123";
        String inputPassword = "ABC321";
        if (!inputPassword.equals(secretPassword)) {
            System.out.println(inputPassword + " is a wrong password.");
        }
    }
}

