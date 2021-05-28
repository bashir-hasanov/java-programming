package day21_string_more_and_more;

public class TrimExample {
    public static void main(String[] args) {
        String word = " java ";
        System.out.println(word.trim());

        word = " s q l ";
        System.out.println(word.trim());
        word = word.replace(" ","");
        System.out.println("word = " + word);
    }
}
