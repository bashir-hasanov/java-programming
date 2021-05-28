package day29_loop_nested;

public class StringManipulationLoopNested {
    public static void main(String[] args) {
        String word = "I love java";
        for (int i = 0; i < word.length(); i++) {
            for (int j = i; j < word.length(); j++) {
                System.out.print(word.charAt(j));
            }
            System.out.println();
        }
    }
}
