package day27_loops;

public class Neighbors {
    public static void main(String[] args) {
        /*
        String word = "jaaavvaa";

if 2 side by side characters match: signal beep - a
aa -> beep - a
vv -> beep - v
aa -> beep - a
         */

        String word = "jaaavvaapprrthgjuufhyyubddttrhjfnmmndghnn";
        for (int index = 0; index < word.length()-1; index++) {
            System.out.print(word.charAt(index));
            System.out.println(word.charAt(index+1));
            if (word.charAt(index)==word.charAt(index+1)){
                System.out.println(word.charAt(index) + " - beep");
            }
        }

    }
}
