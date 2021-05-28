package saim_string_practice_2;
import java.util.Locale;
import java.util.Scanner;
public class CreatingEmail {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter two words:");
        String firstWord = scan.next();
        String secondWord = scan.next();

        if (firstWord.length() >= 6 && secondWord.length() >= 6 ) {
            System.out.println(firstWord.toLowerCase().substring(0, 4)
                    + secondWord.toLowerCase().substring(secondWord.length()-3) + "@cybertek.com");
        } else {
            System.out.println("Invalid data");
        }

    }
}
