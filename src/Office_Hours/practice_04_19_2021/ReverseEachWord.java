package Office_Hours.practice_04_19_2021;

import day38_methods.StringUtils;

public class ReverseEachWord {
    public static void main(String[] args) {
        System.out.println(reverseEachWord("it started to snow in chicago"));
    }

    public static String reverseEachWord (String str) {
        String reverse = "";
        for ( String each : str.split(" ")) {
            String eachReverse = "";
           reverse += StringUtils.reverse(each) + " ";
        }
        return reverse.trim();
    }
}
