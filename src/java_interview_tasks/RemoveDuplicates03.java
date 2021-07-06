package java_interview_tasks;

/**
 * Write a return method that can remove the duplicated values from String
 * Ex:  removeDup("AAABBBCCC")  ==> ABC
 */

public class RemoveDuplicates03 {
    public static void main(String[] args) {
        System.out.println("Remove duplicates = " + removeDuplicates("AAAABBCCCDDDDIIIUUKKK"));

    }

    public static String removeDuplicates (String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            if (!result.contains("" + str.charAt(i))) {
                result += str.charAt(i);
            }
        }
        return result;
    }
}
