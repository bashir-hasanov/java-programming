package day37_methods_overloading;

public class MethodPractice {
    public static void main(String[] args) {
        System.out.println(repeatString("java", 3, '|'));
        System.out.println();
        System.out.println(repeatString("hi", 5, '~'));
    }

    public static String repeatString(String word, int times, char delimiter) {
        String repeat = "";
        for (int i = 1; i <= times; i++) {
            if (i == times) {
                repeat += word;
            } else{
                repeat += word + delimiter;
            }


        }
        return repeat;
    }
}
