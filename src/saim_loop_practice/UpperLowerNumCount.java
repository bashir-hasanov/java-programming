package saim_loop_practice;

public class UpperLowerNumCount {
    public static void main(String[] args) {
        String word = " 2juMp41EEkd4s4";
        char letter;
        int countUpper = 0, countLower = 0, countNum = 0;
        for (int i = 0; i < word.length(); i++) {
            letter = word.charAt(i);
            if (letter >= 'A' && letter <= 'Z') {
                countUpper++;
            }
            if (letter >= 'a' && letter <= 'z') {
                countLower++;
            }
            if (letter >= '0' && letter <= '9') {
                countNum++;
            }
        }
        System.out.println("The word " + word + " contains " + countUpper + " uppercase, " +
                countLower + " lowercase letters and " + countNum + " numbers.");
    }
}
