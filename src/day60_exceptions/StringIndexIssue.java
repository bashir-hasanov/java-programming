package day60_exceptions;

import java.util.Locale;

public class StringIndexIssue {
    public static void main(String[] args) {

        String word = "java";

        try {
            System.out.println("word = " + word);

            // invalid index, code will compile but
            // during runtime exception happens
            System.out.println(word.charAt(7));

        } catch (Exception e) {
            System.out.println("Exception happened and caught");
            System.out.println("Reason = " + e.getMessage());
        }
        System.out.println(word.toUpperCase());



        String word2 = "selenium";
        try {
            System.out.println("word2 = " + word2);
            System.out.println(word2.substring(0, 5));
            System.out.println(word2.substring(0, 15));
        } catch (StringIndexOutOfBoundsException ex) {
            System.out.println("Type of exception: " + ex.getClass().getSimpleName());
            System.out.println("Reason: " + ex.getMessage());
        }
        System.out.println("----- END -----");
    }
}
