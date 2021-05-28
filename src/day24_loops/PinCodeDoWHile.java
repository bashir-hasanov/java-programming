package day24_loops;
import java.util.Scanner;
public class PinCodeDoWHile {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int secretPinCode = 1234;
        int typedPinCode;

        do {
            System.out.println("Enter the pincode:");
             typedPinCode = scan.nextInt();
        } while (typedPinCode != secretPinCode);
        System.out.println("Welcome to your bank account!");
    }
}
