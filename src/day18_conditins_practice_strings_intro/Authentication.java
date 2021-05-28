package day18_conditins_practice_strings_intro;

public class Authentication {
    public static void main(String[] args) {
        int expLast4ssn = 1234;
        int expPinCode = 4321;

        int last4ssn = 5478;
        int pinCode = 5789;

        if (last4ssn == expLast4ssn && pinCode == expPinCode) {
            System.out.println("Authentication successful");
        } else {
            System.out.println("Authentication unsuccessful");
            if (last4ssn != expLast4ssn) {
                System.out.println("Last 4 SSN is incorrect.");
            }
            if (pinCode != expPinCode) {
                System.out.println("Pincode is incorrect");
            }

        }
    }
}
