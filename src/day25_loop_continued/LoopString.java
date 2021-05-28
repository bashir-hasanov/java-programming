package day25_loop_continued;

public class LoopString {
    public static void main(String[] args) {
        String word = "application";
        for (int i = word.length() - 1; i >=0; i--) {
            System.out.print(word.toUpperCase().charAt(i) + " * ");
        }
    }
}
