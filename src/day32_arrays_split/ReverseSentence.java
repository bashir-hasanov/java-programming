package day32_arrays_split;
import java.util.*;
public class ReverseSentence {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter words:");
        String words = scan.nextLine();
        String[] sentence = words.split(" ");
        String reverse = "";

        for ( int i = sentence.length-1; i>=0; i--) {
            reverse += sentence[i] + " ";
        }
        System.out.println("reverse = " + reverse.trim());
    }
}
