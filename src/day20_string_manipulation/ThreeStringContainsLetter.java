package day20_string_manipulation;

public class ThreeStringContainsLetter {
    public static void main(String[] args) {
        String wordOne = "apple";
        String wordTwo = "mouse";
        String wordThree = "java";
        String biggestWordWithA = "";

        if (wordOne.contains("a") && wordOne.length() > biggestWordWithA.length()) {
            biggestWordWithA = wordOne;
        }
        if (wordTwo.contains("a") && wordTwo.length() > biggestWordWithA.length()) {
            biggestWordWithA = wordTwo;
        }
        if (wordThree.contains("a") && wordThree.length() > biggestWordWithA.length()) {
            biggestWordWithA = wordThree;
        }
        if (biggestWordWithA.isEmpty()) {
            System.out.println("No words contained A");
        } else {
            System.out.println("Longest word with a is " + biggestWordWithA);
        }

    }
}
