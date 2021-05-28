package saim_more_practice;
import java.util.Scanner;
public class ValidPassword {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the password");
        String password = scan.next();
        System.out.println("Enter the username:");
        String username = scan.next();

        if (password.length() >= 5 && !password.contains(username)) {
            System.out.println("Valid password");
        } else {
            if (password.length() < 5) {
                System.out.println("Password can not be less than 5 characters");
            }
            if (password.contains(username)) {
                System.out.println("Invalid password, username should not be in it");
                password = "password";
                System.out.println("password = " + password);
            }
        }
    }
}
