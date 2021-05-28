package saim_problem_set_1;
import java.util.*;
public class CharacterChecker {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the character:");
        char letter = scan.next().charAt(0);

        if (letter >= 65 && letter <= 90) {
            System.out.println(letter + " --> UPPERCASE");
        } else if (letter >= 97 && letter <= 122) {
            System.out.println(letter + " --> lowercase");
        }
    }
}
