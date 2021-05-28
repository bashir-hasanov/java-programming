package Office_Hours.practice_03_31_2021;

public class Examples {
    public static void main(String[] args) {
        String word = "java";
        char letter = 'a';
        int count = 0;
        for (int i = 0; i <word.length(); i++) {
            if (word.charAt(i) == letter) {
                count++;
            }


        }
        System.out.println(letter + " was found " + count + " times in " + word);
    }
}
