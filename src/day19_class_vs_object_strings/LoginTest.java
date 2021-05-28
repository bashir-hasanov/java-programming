package day19_class_vs_object_strings;

public class LoginTest {
    public static void main(String[] args) {
        String username = "Cybertek";
        String expUsername = "cybertek12";
        String password = "Abc123";
        String expPassword = "Abc12345";

        if (username.equalsIgnoreCase(expUsername) && password.equals(expPassword)) {
            System.out.println("Pass - user successfully logged in.");
        } else {
            if (!username.equalsIgnoreCase(expUsername)) {
                System.out.println("Fail - incorrect username");
            } else {
                System.out.println("Fail - incorrect password");
            }
        }
    }
}
