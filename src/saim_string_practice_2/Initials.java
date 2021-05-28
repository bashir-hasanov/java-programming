package saim_string_practice_2;

public class Initials {
    public static void main(String[] args) {
        String fullName = "bashir hasanov";
        String first = fullName.substring(0, fullName.indexOf(" "));
        String last = fullName.substring(fullName.indexOf(" ") + 1);
        System.out.println("Your initials are " + first.toUpperCase().charAt(0) + last.toUpperCase().charAt(0));
    }
}
