package day13_conditional_statements;
import java.util.Scanner;
public class AtmPincodeProgram {
    public static void main(String[] args) {
        System.out.println("****WELCOME TO TD BANK ATM****\n");
                Scanner scan = new Scanner(System.in);
                int inputPincode = scan.nextInt();
                int secretPincode = 2589;

                if(inputPincode == secretPincode) {
                    System.out.println("Welcome to your account!");
                    System.out.println("You can withdraw, check balance, deposit.");
                } else {
                    System.out.println("Incorrect pincode! " + inputPincode);
                    System.out.println("Please try again.");
                }
                System.out.println("\n***Thank you for using TD Bank ATM!***");
    }
}
