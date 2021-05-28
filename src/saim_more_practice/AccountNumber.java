package saim_more_practice;
import java.util.Scanner;
public class AccountNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the account number:");
        String accountNumber = scan.next();
        if (accountNumber.startsWith("2")) {
            if (accountNumber.length() == 7) {
                System.out.println("Valid 7 digit account number.");
            } else {
                System.out.println("Invalid 7 digit account number");
            }
        } else if (accountNumber.startsWith("5")) {
            if (accountNumber.length() == 10) {
                System.out.println("Valid 5 digit account number");
            } else {
                System.out.println("Invalid 5 digit acount number.");
            }

        } else {
            System.out.println("Invalid account number");
        }
    }
}
