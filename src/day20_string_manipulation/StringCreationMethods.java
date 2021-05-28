package day20_string_manipulation;
import java.lang.*;   //import all classes from java.lang package
import java.util.*;   //import all classes rom java.util package
public class StringCreationMethods {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word1 = "potato";
        String word2 = new String ("tomato");
        System.out.println("word1 = " + word1);
        System.out.println("word2 = " + word2);
        String word3 = "";
        String word4 = new String();
        System.out.println(word3.equals(word4)); //true
    }
}
