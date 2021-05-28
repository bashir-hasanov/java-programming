package day28_loops;
import java.util.*;
public class RandomPassword {
    public static void main(String[] args) {
        String source = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789_!@#$%^&*";
        Random input = new Random();
        String password = "";
        for (int i = 0; i <= 12; i++) {
            int index = input.nextInt(71);
            System.out.print(source.charAt(index));
            password += source.charAt(index);
        }
        System.out.println("\nYour password is: " + password);
    }
}
