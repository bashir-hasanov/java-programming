package saim_loop_practice;
import java.util.*;
public class PrimeNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number:");
        int number = scan.nextInt();

        for ( int j = 2; j < number; j ++) {
            int checknumber = j;
            boolean isPrime = true;
            for ( int i = 2 ; i < checknumber ; i++) {
                if ( checknumber % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.println(checknumber + " ");
            }

        }
    }
}
