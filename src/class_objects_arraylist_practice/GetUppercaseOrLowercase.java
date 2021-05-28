package class_objects_arraylist_practice;

import java.util.ArrayList;

public class GetUppercaseOrLowercase {
    public static void main(String[] args) {
        System.out.println(getUppercaseOrLowercase("ABchGjYkIlkOpLLLnMbVVmMMnErrRR", true));
        System.out.println(getUppercaseOrLowercase("ABchGjYkIlkOpLLLnMbVVmMMnErrRR", false));

    }

    public static ArrayList<String> getUppercaseOrLowercase (String str, boolean isUppercase) {
        ArrayList<String> result = new ArrayList<>();
        char[] letters = str.toCharArray();
        for (char each : letters) {
            if (isUppercase) {
                if (Character.isUpperCase(each)) {
                    result.add("" + each);
                }
            } else {
                if (Character.isLowerCase(each)) {
                    result.add("" + each);
                }
            }
        }
        return result;
    }
}
