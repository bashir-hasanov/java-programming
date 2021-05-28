package saim_more_practice;
import java.util.Scanner;
public class FullNameLastName {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the full name:");
        String fullName = input.nextLine();
        System.out.println("Enter the last name:");
        String lastName = input.next();

        if (fullName.contains(lastName)) {
            System.out.println("Same last name");
        } else {
            System.out.println("Not the same last name");
        }
    }
}
