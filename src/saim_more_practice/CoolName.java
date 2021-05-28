package saim_more_practice;
import java.util.Scanner;
public class CoolName {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your name:");
        String name = scan.next();

        if (name.startsWith("a") || name.startsWith("z")) {
            System.out.println("Your name is cool");
        } else if (name.endsWith("m")) {
            System.out.println("Almost cool");
        } else {
            System.out.println("Sorry not a cool name");
        }
    }
}
