package practice_03_22_2021;
import java.util.Scanner;
public class ScannerNextLine {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number:");
        int number = scan.nextInt();
        System.out.println("Enter your name:");
        scan.nextLine();
        String name = scan.nextLine();

        System.out.println(number);
        System.out.println(name);


    }
}
