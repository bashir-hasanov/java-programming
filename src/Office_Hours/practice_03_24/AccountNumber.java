package Office_Hours.practice_03_24;
import java.util.*;
public class AccountNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        String accountNumber = scan.next();
        if (accountNumber.startsWith("2")) {
            if (accountNumber.length() == 7) {
                System.out.println("Valid 7 digit account number.");
            } else {
                System.out.println("Not a valid 7 digit acccount number.");
            }
        } else if (accountNumber.startsWith("5")) {
            if (accountNumber.length() == 10) {
                System.out.println("Valid 10 digit account number.");
            } else {
                System.out.println("Not a valid 10 digit account number.");
            }
        } else {
            System.out.println("Not a valid account number.");
        }

    }
}
