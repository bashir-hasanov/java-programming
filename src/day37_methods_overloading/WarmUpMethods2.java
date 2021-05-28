package day37_methods_overloading;
import java.util.*;
public class WarmUpMethods2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("ENTER USERNAME AND PASSWORD:");
        String username = s.next();
        String password = s.next();
        System.out.println("TEST RESULT: " + loginNonVoid(username, password));
    }

    public static boolean loginNonVoid (String username, String password) {
        String secretUsername = "cybertekStudent";
        String secretPassword = "abc123";
        if (username.equals(secretUsername) && password.equals(secretPassword)) {
            return true;
        } else {
            return false;
        }
    }
}
