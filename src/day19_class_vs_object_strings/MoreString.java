package day19_class_vs_object_strings;

import java.util.Locale;

public class MoreString {
    public static void main(String[] args) {
        String country = "UK";
        if (country.equals(country.toUpperCase())) {
            System.out.println("Case matches.");
        } else {
            System.out.println("Case does not match.");
        }

        String word = "UK";
        String uWord = word.toUpperCase();

        System.out.println("word = " + word);
        System.out.println("uWord = " + uWord);

    }
}
