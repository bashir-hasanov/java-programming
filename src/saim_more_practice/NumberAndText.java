package saim_more_practice;
import java.util.Scanner;
public class NumberAndText {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the message:");
        String message = scan.nextLine();
        int number = 1;

        switch (number) {
            case 1:
                message = message.replace('a','e');
                break;
            case 2:
                message = message.replace('s','r');
                break;
            case 3:
                message = message.replace('o','z');
                break;
        }
        System.out.println(message);
    }
}
