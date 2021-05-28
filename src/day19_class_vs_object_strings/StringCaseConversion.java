package day19_class_vs_object_strings;

import java.util.Locale;

public class StringCaseConversion {
    public static void main(String[] args) {

        String word = "CyberTek";
        String sentence = "I love Java";

        System.out.println(word);
        System.out.println(word.toLowerCase());
        System.out.println(word.toUpperCase());
        System.out.println("JAVA IS Very FuN".toLowerCase());
        System.out.println(sentence.toLowerCase());

        word.toLowerCase();
        System.out.println(word);

        String wordInLCase = word.toLowerCase();
        System.out.println(wordInLCase);

        word = word.toLowerCase();
        System.out.println(word);

        String city = word.toUpperCase();
        System.out.println(city);

        String company = "Amazon";
        System.out.println(company.toUpperCase());
        System.out.println("company in upper case -  " + company.toUpperCase());
        System.out.println("java".toUpperCase());

        //change company Amazon to AMAZON
        System.out.println("company = " + company);
        company = company.toUpperCase();
        System.out.println("company = " + company);
    }
}
