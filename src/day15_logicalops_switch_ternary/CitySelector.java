package day15_logicalops_switch_ternary;

public class CitySelector {
    public static void main(String[] args) {
        String city = "Moscow";
        if (city.equals("Moscow") || city.equals("Tampa")) {
            System.out.println("Willing to relocate to " + city);
        } else {
            System.out.println("I don`t want to move to " + city);
        }

        String teacher = "Nadir";
        if (teacher.equals("Saim") || teacher.equals("Murodil")) {
            System.out.println("It is a Java class with " + teacher);
        } else {
            System.out.println("It is not a Java class. It is a soft skills class with " + teacher);
        }

        teacher = "Akbar";

        if (teacher.equals("Saim") || teacher.equals("Murodil")) {
            System.out.println("It is a Java class with " + teacher);
        } else if (teacher.equals("Nadir")) {
            System.out.println("It is a soft skills class with " + teacher);
        } else {
            System.out.println("Some other class with " + teacher);
        }

        //company - Google, salary - 100k
        double salary = 107_000.0;
        String company = "Google";
        if (salary >= 100_000.0 || company.equals("Google")) {
            System.out.println("I accept to work at " + company + " with $" + salary +  " salary.");
        } else {
            System.out.println(" I do not accept to work at " + company + " $" + salary + " is too low." );
        }
    }
}