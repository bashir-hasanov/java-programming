package day24_loops;
import java.util.*;
public class GuessTheNumberGame {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int secretNumber = 44;
        int guessingNumber;
         do {
             System.out.println("Guess the secret number");
             guessingNumber = scan.nextInt();
             if (guessingNumber > secretNumber) {
                 System.out.println("Wrong: your number is too large");
             } else if (secretNumber > guessingNumber) {
                 System.out.println("Wrong: your number is too small");
             }
         } while (guessingNumber != secretNumber);
        System.out.println("Congratulations! You won! Secret number: " + secretNumber);
    }
}
