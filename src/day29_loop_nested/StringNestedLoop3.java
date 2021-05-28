package day29_loop_nested;

public class StringNestedLoop3 {
    public static void main(String[] args) {
        String word = "java";
        for (int a = 0; a < word.length(); a++ ) {
            int count = 0;
            for (int b = 0; b < word.length(); b++) {
                if (word.charAt(a) == word.charAt(b)) {
                    count++;
                }

            }
            System.out.println(word.charAt(a) + " = " + count);
        }
    }
}
