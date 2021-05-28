package day38_methods;

public class StringUtils {
    public static void main(String[] args) {
        System.out.println(isNullOrEmpty(null));
        System.out.println(isNullOrEmpty(""));
        String word = null;
        System.out.println("isNullOrEmpty(word) = " + isNullOrEmpty(word));
   }

    public static boolean isNullOrEmpty(String str) {
        if (str == null || str.isEmpty()) {
            return true;
        }
            return false;
    }

    public static String reverse(String str) {
        String reverse = "";
        for (int i = str.length()-1; i >= 0; i--) {
            reverse += str.charAt(i);
        }
        return reverse;
    }
}
