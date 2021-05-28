package day32_arrays_split;
import java.util.*;
public class SplitMethod {
    public static void main(String[] args) {
                   //     0    1       2      3
        String words = "java:python:selenium:html";
        String[] wordsArray = words.split(":");
        System.out.println(Arrays.toString(wordsArray));
        System.out.println("Length of the array --> " + wordsArray.length);

        for ( String eachWord : wordsArray) {
            System.out.println(eachWord);
        }

        String sentence = "Today I am coding java arrays";
        String[] newSentence = sentence.split(" ");
        System.out.println(Arrays.toString(newSentence));

        System.out.println("First word - " + newSentence[0]);
        System.out.println(sentence.split(" ")[0]);

        System.out.println(" Number of words in this sentence is " + newSentence.length);
        System.out.println(" Number of words in this sentence is " + sentence.split(" ").length);

        for (String each : newSentence) {
            System.out.println(newSentence);
        }
    }
}
