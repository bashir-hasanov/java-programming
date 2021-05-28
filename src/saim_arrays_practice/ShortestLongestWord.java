package saim_arrays_practice;
import javax.xml.transform.Source;
import java.util.*;
public class ShortestLongestWord {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the words:");
        String[] words = {input.next(), input.next(), input.next(),
                input.next(), input.next(), input.next()};
        String longest = words[0];
        String shortest = words[0];
        for ( String eachWord : words) {
            if (eachWord.length() > longest.length()) {
                longest = eachWord;
            }
            if (eachWord.length() < shortest.length()) {
                shortest = eachWord;
            }
        }
        System.out.println("Shortest  word--> " + shortest);
        System.out.println("Longest word --> " + longest);
        }
    }

