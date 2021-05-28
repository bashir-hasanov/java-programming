package saim_more_practice;
import java.util.Scanner;
public class EligibleToVote {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.println("What is the country of citizenship?");
        String countryOfCitizenship = scan.next();
        if (countryOfCitizenship.equals("USA")) {
            System.out.println("Enter your age:");
            int age = scan.nextInt();
            if (age >= 18) {
                System.out.println("You are eligible to vote.");
            } else {
                System.out.println("You must be at least 18 years old to vote.");
            }

        } else {
            System.out.println("You must be US citizen in order to vote.");
        }
    }
}
