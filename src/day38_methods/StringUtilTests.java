package day38_methods;
import static day38_methods.PalindromeV2.*;
public class StringUtilTests {
    public static void main(String[] args) {
        String userName = "";
        if(StringUtils.isNullOrEmpty(userName)) {
            System.out.println("FAIL: Username can not be null or empty");
        }
        System.out.println(isPalindrome("Bashirihsab"));
        System.out.println("isPalindrome(civicivic) = " + isPalindrome("civicivic"));
        System.out.println("isPalindrome(kayak) = " + isPalindrome("kayak"));

        System.out.println(StringUtils.reverse("bashir"));
        String word = "java";
        String revWord = StringUtils.reverse(word);
        System.out.println("word = " + word);
        System.out.println("revWord = " + revWord);
    }


    public static boolean isPalindrome(String str) {
        String reverse = "";
        for (int i = str.length()-1; i >=0; i--) {
            reverse +=str.charAt(i);
            if (reverse.equalsIgnoreCase(str)) {
                return true;
            }
        }
        return false;
    }
}
