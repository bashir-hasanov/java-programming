package saim_arrays_practice;
import java.util.*;
public class ShortestLongestWordV2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How many words will you enter:");
        String[] words = new String[input.nextInt()];
        input.nextLine();

        for (int i = 0; i < words.length; i++) {
            System.out.println("Enter word: " + (i+1));
            words[i] = input.nextLine();
        }
        System.out.println(Arrays.toString(words));
        String smallest, largest;
        String[] smallAndLarge = {"", ""};

        for (String eachWord : words) {
            if (eachWord.length() < smallAndLarge[0].length()) {
                smallAndLarge[0] = eachWord;
            }

            if (eachWord.length() > smallAndLarge[1].length()) {
                smallAndLarge[1] = eachWord;
            }
        }

        System.out.println("Shortest element = " + smallAndLarge[0]);
        System.out.println("Longest element = " + smallAndLarge[1]);
    }
}
