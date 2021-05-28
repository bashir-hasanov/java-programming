package saim_problem_set_1;
import java.util.*;
public class QualificationForArmy {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your citizenship:");
        String citizenship = scan.next();
        System.out.println("Are you a U.S. resident?");
        boolean isResident = scan.nextBoolean();

        if (citizenship.equals("USA") || isResident) {
            System.out.println("Enter your age:");
            int age = scan.nextInt();
            if (age >= 18 && age <= 35) {
                System.out.println("Do you have a high school diploma?");
                boolean hasDiploma = scan.nextBoolean();
                if (hasDiploma) {
                    System.out.println("You are qualified for the U.S. Army.");
                } else {
                    System.out.println("You must have a high school diploma.");
                }
            } else {
                System.out.println("Your age must be between 18 to 35 years old.");
            }
        } else {
            System.out.println("You must be a U.S. citizen or a resident");
        }
    }
}
