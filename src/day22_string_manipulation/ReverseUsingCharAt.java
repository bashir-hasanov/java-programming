package day22_string_manipulation;

import javax.lang.model.SourceVersion;

public class ReverseUsingCharAt {
    public static void main(String[] args) {
        String word = "anna";
        System.out.println("" + word.charAt(3) + word.charAt(2)
                + word.charAt(1) + word.charAt(0));

        System.out.print(word.charAt(3));
        System.out.print(word.charAt(2));
        System.out.print(word.charAt(1));
        System.out.println(word.charAt(0));
        System.out.println(word);

        String word2 = "" + word.charAt(3) + word.charAt(2)
                + word.charAt(1) + word.charAt(0);
        System.out.println(word2 + " is the reverse of " + word);


        if (word2.equalsIgnoreCase(word)) {
            System.out.println(word +  " and " + word2 + " are palindrome words");
        } else {
            System.out.println(word + " and " + word2 + " are not palindrome words.");
        }
    }
}
