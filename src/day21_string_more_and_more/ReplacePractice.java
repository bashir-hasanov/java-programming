package day21_string_more_and_more;

public class ReplacePractice {
    public static void main(String[] args) {
        String word = "github";
        System.out.println(word.toUpperCase());                               //GITHUB
        System.out.println(word.replace("hub","lab").replace("g","sh"));      //shitlab
        System.out.println("word = " + word);                                 //github

        word = word.replace("hub","lab");
        System.out.println("word = " + word);                   //gitlab
        System.out.println(word.replace("i","o").replace("a","i"));

        String sentence = "java is fun";
        sentence = sentence.replace("java","selenium")
                           .replace("fun","a lot of fun");
        String sentenceNoSpace = sentence.replace(" ", "");

        System.out.println("sentenceNoSpace = " + sentenceNoSpace);

        String result = "1-48 of over 4000 results for java book";
        result = result.replace("1-48 of over ","")
                       .replace(" results for java book","");
        System.out.println("result = " + result);

    }
}
