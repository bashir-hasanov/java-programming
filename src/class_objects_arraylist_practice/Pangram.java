package class_objects_arraylist_practice;

import java.util.Locale;

public class Pangram {
    public static void main(String[] args) {
        System.out.println(isPangram("Back in June we delivered oxygen equipment of the same size"));
    }

    public static boolean isPangram(String str) {
        str = str.toLowerCase().replace(" ","");
        String alphabet = "";
            for (char i = 'a'; i <='z'; i++) {
                alphabet += i;
            }
            for (int i = 0; i < alphabet.length(); i++) {
                if (!str.contains(alphabet.charAt(i) + "")) {
                    return false;
                }
            }
       return true;
    }
}
