package saim_string_practice_2;

public class MoveFirstWord {
    public static void main(String[] args) {
        String sentence = "Bashir is a future Software Developer Engineer in Test";
        String firstWord = sentence.substring(0, sentence.indexOf(" "));
        String otherWords = sentence.substring(sentence.indexOf(" ") +1);
        System.out.println(otherWords + " " + firstWord);
    }
}
