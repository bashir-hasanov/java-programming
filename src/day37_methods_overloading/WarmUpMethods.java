package day37_methods_overloading;

public class WarmUpMethods {
    public static void main(String[] args) {
        loginVoid("cybertekLoginuser", "hgfj345");   //negative test
        loginVoid("cybertekStudent", "abc123");      //positive test
    }

    public static void loginVoid(String username, String password) {
        String secretUsername = "cybertekStudent";
        String secretPassword = "abc123";

        if (username.equals(secretUsername) && password.equals(secretPassword)) {
            System.out.println("Login Successful, welcome cybertekStudent");
        } else {
            System.out.println("Incorrect username or password");
        }
    }

}
