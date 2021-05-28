package day21_string_more_and_more;

public class StringCharAt {
    public static void main(String[] args) {
        String word = "java";
        System.out.println(word.charAt(0)); //j
        System.out.println(word.charAt(1)); //a
        System.out.println(word.charAt(2)); //v
        System.out.println(word.charAt(3)); //a
        System.out.println(word.length());  //4

        String company = "Cybertek";
        System.out.println("first letter = " + company.charAt(0));
        char first = company.charAt(0);
        System.out.println("first letter = " + first);
        char second = company.charAt(1);
        System.out.println("second letter = " + second);
        char third = company.charAt(2);
        System.out.println("third letter = " + third);
        char forth = company.charAt(3);
        System.out.println("forth letter = " + forth);
        char fifth = company.charAt(4);
        System.out.println("fifth letter = " + fifth);
        char sixth = company.charAt(5);
        System.out.println("sixth letter = " + sixth);
        char seventh = company.charAt(6);
        System.out.println("seventh letter = " + seventh);
        char eigth = company.charAt(7);
        System.out.println("eigth letter = " + eigth);

        System.out.println(first + " " + second + " " + third + " "
                + forth + " " + fifth + " " + sixth + " " + seventh + " " + eigth);

        String withSpaces = first + " " + second + " "
                + third + " " + forth + " " + fifth +
                " " + sixth + " " + seventh + " " + eigth;
        System.out.println("withSpaces = " + withSpaces);

        String word1 = "mom";
        char first1 = word1.charAt(0);
        char last = word1.charAt(2);
        System.out.println(first1 == last);

        if (first1 == last) {
            System.out.println("First and last letters match.");
        } else {
            System.out.println("First and last letters dismatch.");
        }

        String anotherWord = "level";
        char firstLetter = anotherWord.charAt(0);
        int count = anotherWord.length();
        char lastLetter = anotherWord.charAt(count - 1);

        System.out.println(firstLetter);
        System.out.println(lastLetter);

        if (firstLetter == lastLetter) {
            System.out.println(anotherWord + " - first and last match");
        } else {
            System.out.println(anotherWord + " - first and last do not match");
        }
    }
    }
