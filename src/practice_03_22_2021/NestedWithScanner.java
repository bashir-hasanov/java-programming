package practice_03_22_2021;
import java.util.*;
public class NestedWithScanner {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.println("Enter a number:");
        int num = scan.nextInt();

        if (num > 0) {
            System.out.println("Enter a single word:");
            String word = scan.next();
            if (word.length() % 2 == 0) {
                System.out.println(word + " is even length.");
            } else {
                System.out.println(word + " is odd length.");
            }
        } else {
            //negative
            System.out.println("Enter a character:");
            char letter = scan.next().charAt(0);
            if (letter >= 'A' && letter <= 'Z') {
                System.out.println(letter + " is an uppercase letter.");
            } else if (letter >= 'a' && letter <= 'z') {
                System.out.println(letter + " is a lowercase letter.");
            } else {
                System.out.println(letter + " is not a valid letter.");
            }
        }

    }
}
