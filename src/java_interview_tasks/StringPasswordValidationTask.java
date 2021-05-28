package java_interview_tasks;

public class StringPasswordValidationTask {
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
