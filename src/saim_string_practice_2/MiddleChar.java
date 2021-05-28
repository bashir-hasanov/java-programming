package saim_string_practice_2;

public class MiddleChar {
    public static void main(String[] args) {
        String word = "snake";

        if (word.length() % 2 == 0) {
            System.out.println("The middle characters: " + word.charAt(word.length() / 2 -1) + ""
                    + word.charAt(word.length()/2));
        } else {
            System.out.println("The middle character: " + word.charAt(word.length()/2));
        }
    }
}
