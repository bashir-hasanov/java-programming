package saim_loop_practice;

public class LongestSubstring {
    public static void main(String[] args) {
        String str = "aaabbbcccccddddeeeeeeeeeee";
        String longestSubstring= "";
        String temp = "";  //
        for(int i=0; i< str.length()-1; i++) {
            temp += str.charAt(i); //
            if (str.charAt(i) != str.charAt(i + 1) || i == str.length() - 2) {

                if (i == str.length() - 2 && str.charAt(i) == str.charAt(i + 1)) {
                    temp += str.charAt(i + 1);
                }
                if (temp.length() > longestSubstring.length()) {
                    longestSubstring = temp;
                }
                temp = "";
            }
        }

         System.out.println("Longest substring: "+ longestSubstring);
    }
}
