package Office_Hours.practice_03_24;

import java.util.Locale;

public class CharIndex {
    public static void main(String[] args) {
        String s = "java";
        System.out.println(s.charAt(3));
        System.out.println(s.charAt(s.length() - 1));
        System.out.println(s.charAt(0) + "" + s.charAt(1) + "" + s.charAt(2) + "" + s.charAt(3));

        String upper = "" + s.toUpperCase().charAt(0) + s.toUpperCase().charAt(3);
        System.out.println(upper);
    }
}
