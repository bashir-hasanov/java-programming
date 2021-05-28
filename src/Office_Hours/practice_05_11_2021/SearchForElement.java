package Office_Hours.practice_05_11_2021;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class SearchForElement {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(Arrays.asList("one", "two", "three", "two"));
        System.out.println(findIndex(list, "two"));
    }

    public static int findIndex (ArrayList<String> words, String element) {
        int index = -1;

        for (int i = 0; i < words.size(); i++) {
            if (words.get(i).equals(element)) {
                index = i; //return i
                break;
            }
        }
        return index;
    }
}
