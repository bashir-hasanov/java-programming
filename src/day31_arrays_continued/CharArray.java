package day31_arrays_continued;

import javax.lang.model.SourceVersion;
import java.util.*;
public class CharArray {
    public static void main(String[] args) {
        char[] letters = {'j', 'a', 'v', 'a', ' ', 'i', 's',' ', 'f', 'u', 'n' };
        for ( char eachLetter : letters) {
            System.out.print(eachLetter);


        }
        System.out.println();
        System.out.println(Arrays.toString(letters));
        String sentence = new String (letters);
        System.out.println("\n"+sentence);

        String item = "wooden spoon";
        char[] itemsArray = item.toCharArray();
        System.out.println("itemsArray.length = " + itemsArray.length);
        System.out.println("item.length() = " + item.length());
        System.out.println(item.toCharArray());

        String[] fruits = {"bananas", "apples", "kiwis", "mangoes", "papayas", "strawberries"};
        String fruitStr = "";
        for (String eachFruit : fruits) {
            System.out.print(eachFruit + " - ");
            fruitStr += eachFruit + "-";

        }
        System.out.println("\neachFruit = " + fruitStr);

        String[] languages = {"java", "python", "php", "ruby", "javascript"};
        System.out.println(String.join("|", languages));
        System.out.println(String.join(" ## ", languages));
        String lang = String.join(" <> ", languages);
        System.out.println(lang);

        char[] alphas = {'a', 'l', 'p', 'h', 'a', 'b', 'e', 't'};
        String word = new String(alphas);
        System.out.println("word = " + word);
    }
}
