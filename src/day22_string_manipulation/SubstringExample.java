package day22_string_manipulation;

public class SubstringExample {
    public static void main(String[] args) {
        String word = "java is fun";
        /**
         * 1) word.index(startIndex, endIndex)
         */
        System.out.println(word.substring(0, 3));   //jav
        System.out.println(word.substring(0, 4));   //java
        System.out.println(word.substring(0, 7));   //java is
        System.out.println(word.substring(5, 7));   //is
        System.out.println(word.substring(8, 11));  //fun
        System.out.println(word.substring(8));      //fun
    }
}
