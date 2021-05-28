package day39_wrapper_classes;

public class WrapperClassMethods {
    public static void main(String[] args) {
        System.out.println(Integer.max(10,5));
        System.out.println(Integer.sum(50, 35));
        System.out.println(Integer.min(5, 2));
        System.out.println("Minimum integer --> " + Integer.MIN_VALUE);
        System.out.println("Maximum integer --> " + Integer.MAX_VALUE);

        System.out.println(Double.max(234.1, 14135.9));
        System.out.println("Maximum double --> " + Double.MAX_VALUE);
        System.out.println("Minimum double --> " + Double.MIN_VALUE);

        System.out.println(Double.compare(5, 1));
        System.out.println(Double.compare(1, 5));
        System.out.println(Double.compare(5, 5));

        System.out.println(Character.isDigit('5'));
        System.out.println(Character.isDigit('F'));
        System.out.println(Character.isAlphabetic('S'));
        System.out.println(Character.isAlphabetic('6'));
        System.out.println(Character.isLetter('k'));
        System.out.println(Character.isLetter('O'));
        System.out.println(Character.isLetter('8'));
        System.out.println(Character.isUpperCase('G'));
        System.out.println(Character.isLowerCase('p'));

        char letter = 'A';
        if (letter >= 'A' && letter <= 'Z') {
            System.out.println(letter + " is uppercase");
        }

        if (Character.isUpperCase(letter)) {
            System.out.println(letter + " is uppercase");
        }

        String word = " JaVa iS FuN";
        for (int i = 0; i < word.length(); i++) {
            if (Character.isUpperCase(word.charAt(i))) {
                System.out.println(word.charAt(i));
            }
        }

        System.out.println(Character.isSpaceChar(' '));
        System.out.println(Boolean.TRUE);
        System.out.println(Boolean.FALSE);
    }
}
