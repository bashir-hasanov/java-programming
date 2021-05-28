package Office_Hours.practice_03_31_2021;

public class CountJava {
    public static void main(String[] args) {
        String word = "java is fun. java class today, not javascript";
        int count = 0;
        String word1 = "java";
        for (int i = 0; i < word.length() -3; i++) {
            if (word1.equals(word.substring(i, i + 4))) {
                count++;
            }
        }
        System.out.println(word1 + " appears " + count + " times.");
    }
}
