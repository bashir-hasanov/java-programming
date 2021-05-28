package day22_string_manipulation;
import java.util.Scanner;
public class ReverseIt {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        //WRITE YOUR CODE HERE
        if (word.length() == 5) {
            System.out.print(word.charAt(word.length()-1));
            System.out.print(word.charAt(word.length()-2));
            System.out.print(word.charAt(word.length()-3));
            System.out.print(word.charAt(word.length()-4));
            System.out.print(word.charAt(word.length()-5));
        } else if (word.length() < 5) {
            System.out.println("Too short!");
        } else {
            System.out.println("Too long!");
        }
    }
}
