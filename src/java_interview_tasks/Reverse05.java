package java_interview_tasks;

/**
 * Write a return method that can reverse  String
 * Ex: Reverse("ABCD"); ==> DCBA
 */

public class Reverse05 {
    public static void main(String[] args) {
        System.out.println("Reverse the String --> " + reverse("DRagON"));
    }

    public static String reverse (String str) {
        String result = "";
        for (int i = str.length()-1; i >= 0; i--) {
            result += str.charAt(i);
        }
        return result;
    }
}
