package day40b_review_class;
import java.util.*;
public class MergeStrings {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the words:");
        String one = input.next();
        String two = input.next();
        String merge = "";

        if (one.length() >= two.length()) {
            for (int i = 0; i < two.length(); i++) {
                merge += one.charAt(i) + "" + two.charAt(i);
            }
            merge += one.substring(two.length()-1);

        }
        if (two.length() > one.length()) {
            for (int j = 0; j < one.length(); j++) {
                merge += one.charAt(j) + "" + two.charAt(j);
            }
            merge += two.substring(one.length()-1);


        }
        System.out.println("Merged strings one and two --> " + merge);
    }
}
