package Office_Hours.practice_04_06_2021;

public class LongestSubstring {
    public static void main(String[] args) {
        String word = "aaabbbcccccddddeeeeeeeeeeeeee";
        String longestSubstring = "";
        String temp = "";
        for (int i = 0; i < word.length()-1; i++) {
            temp += word.charAt(i);  //aaa

            if (word.charAt(i) != word.charAt(i + 1)) {

                if (temp.length() > longestSubstring.length()) {
                    longestSubstring = temp;

                }
                temp = "";
            }
        }
        System.out.println("The longest substring is --> " + longestSubstring);

    }
}
