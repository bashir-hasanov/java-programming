package day09_scanner_practice;
// class Scanner is in package java.util
import java.util.Scanner;  // import class Scanner
public class AskAge2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // create new object from Scanner class
        System.out.println("- How old are you?");
        int age = scan.nextInt();
        // use scanner function to accept int from keyboard
        System.out.println(age + " - that`s great age!");
    }
}
