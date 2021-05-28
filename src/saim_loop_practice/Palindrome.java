package saim_loop_practice;
import java.util.*;
public class Palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the word:");
        String word = input.next();
        String backwards = "";
        boolean isPalindrome = true;
        for (int a = word.length()-1; a >=0; a--) {
            backwards +=word.charAt(a);
            if (backwards.equals(word)) {
                isPalindrome = true;
            } else {
                isPalindrome = false;
            }

        }
        System.out.println(isPalindrome);
    }
}
