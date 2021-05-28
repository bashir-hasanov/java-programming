package day21_string_more_and_more;

public class StringIndexOf {
    public static void main(String[] args) {
        String word = "java";
        System.out.println(word.indexOf('m'));  //-1
        System.out.println(word.indexOf("va")); //2
        System.out.println(word.indexOf("j"));  //0
    }
}
