package java_interview_tasks;

/**
 * Write a return  method that can find the unique characters from the String
 * Ex:  unique("AAABBBCCCDEF")  ==>  "DEF";
 */

public class FindTheUnique04 {
    public static void main(String[] args) {
        System.out.println("Find the unique --> " + unique("AAABBCCCDDDEFHHHGUUIJJKSSSLDDMNOOP"));
    }

    public static String unique (String str) {
        char[] letters = str.toCharArray();
        String result = "";
        for (int i = 0; i < letters.length; i++) {
            int count = 0;
            for (int j = 0; j < letters.length; j++) {
                if (letters[j] == letters[i]) {
                    count++;
                }
            }
            if (count == 1) {
                result += letters[i];
            }
        }
        return result;
    }
}
