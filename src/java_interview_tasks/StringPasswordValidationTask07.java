package java_interview_tasks;

/**
 * . Write a return method that can verify if a password is valid or not.
 * requirements:
 *
 * 1. Password MUST be at least have 6 characters and should not contain space
 * 2. PassWord should at least contain one upper case letter
 * 3. PassWord should at least contain one lowercase letter
 * 4. Password should at least contain one special characters
 * 5. Password should at least contain a digit
 *
 * if all requirements above are met, the method returns true, otherwise returns  false
 */

public class StringPasswordValidationTask07 {
    public static void main(String[] args) {

        System.out.println("Is this password valid? - " + PasswordValidation("BAsh!#05"));
    }


    public static boolean PasswordValidation(String password) {

        String lowercase = "(.*[a-z].*)";
        String uppercase = "(.*[A-Z].*)";
        String numbers = "(.*[0-9].*)";
        String specialChars = "(.*[ -/, :-@].*)";

        boolean  hasLower = password.matches(lowercase),
                hasUpper = password.matches(uppercase),
                hasDigits = password.matches(numbers),
                hasSpecial = password.matches(specialChars),
                valid = false;

        if (password.length() >= 6 && !password.contains(" ")) {
            if (hasLower && hasUpper && hasDigits && hasSpecial) {
                valid = true;
            }
        }
        return valid;
    }

}
