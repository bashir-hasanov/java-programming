package saim_more_practice;
import java.util.Scanner;
public class LongestWord {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the first word:");
        String first = scan.next();
        System.out.println("Enter the second word:");
        String second = scan.next();
        System.out.println("Enter the third word:");
        String third = scan.next();

        if (first.length() > second.length() && first.length() > third.length() && first.contains("a")) {
            System.out.println(first + " is the longest word");
        } else if (second.length() > first.length() && second.length() > third.length() && second.contains("a")) {
            System.out.println(second + " is the longest word");
        } else if (third.length() > first.length() && third.length() > second.length() && third.contains("a")) {
            System.out.println(third + " is the longest word");
        }

    }
}
