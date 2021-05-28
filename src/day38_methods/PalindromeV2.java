package day38_methods;

import java.util.Locale;

public class PalindromeV2 {
    public static void main(String[] args) {
        System.out.println("isPalindrome(civicivic) = " + isPalindrome("civicivic"));
        System.out.println("isPalindrome(kayak) = " + isPalindrome("kayak"));
    }
    public static boolean isPalindrome(String str) {
        str = str.toLowerCase();
        for (int i = 0; i < str.length()/2; i++) {
            if (str.charAt(i) != str.charAt(str.length()-1-i)) {
                return false;
            }
        }
        return true;
    }
}
