package day45_oop;

public class ComparingStrings {
    public static void main(String[] args) {
        String word1 = "java";              //stored in String pool
        String word2 = "java";              //re-use from String pool
        String word3 = new String("java");  //create in HEAP, but outside String pool
        String word4 = new String("java");

        System.out.println(word1 == word2);  //TRUE
        System.out.println(word1 == word3);  //FALSE - point to different object in POOL and HEAP
        System.out.println(word3 == word4);  //FALSE - point to different objects in HEAP

        System.out.println(word1.equals(word2));  //TRUE - comparing values
        System.out.println(word2.equals(word3));  //TRUE - comparing values
        System.out.println(word3.equals(word4));  //TRUE - comparing values
        System.out.println(word1.equals(word4));  //TRUE - comparing values

    }
}
