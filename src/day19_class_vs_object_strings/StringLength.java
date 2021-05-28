package day19_class_vs_object_strings;

public class StringLength {
    public static void main(String[] args) {

        String word = "java";
        System.out.println(word);
        System.out.println(word.length() * 5);

        String firstName = "Bashir";
        System.out.println(firstName + " - " + firstName.length() + " characters.");
        int count = firstName.length();
        System.out.println("count = " + count);

        String password = "abc1456485";

        if (password.length() >= 6) {
            System.out.println("Valid AMAZON password");
        } else {
            System.out.println("Password is too short");
        }
    }
}
