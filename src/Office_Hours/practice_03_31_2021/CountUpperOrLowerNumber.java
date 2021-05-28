package Office_Hours.practice_03_31_2021;
public class CountUpperOrLowerNumber {
    public static void main(String[] args) {
        System.out.println("Enter the word:");
        String str = "2juMp41EEkd4s4";
        int upperCase = 0, lowerCase = 0, number = 0;

        for (int i = 0; i < str.length(); i++) {
            char eachLetter = str.charAt(i);
            if (eachLetter >= 'A' && eachLetter <= 'Z') {
                upperCase++;
            } else if (eachLetter >= 'a' && eachLetter <= 'z') {
                lowerCase++;
            } else if (eachLetter >= '0' && eachLetter <= '9') {
                number++;
            }
        }
        System.out.println("There are " + upperCase + " uppercase letters, "
                + lowerCase + " lowercase letters and " + number + " numbers in " + str);
    }
}
