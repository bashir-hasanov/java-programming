package day35_methods_with_param;

public class buildEmail {
    public static void main(String[] args) {

        buildEmail("Saim", "cybertekschool");
        buildEmail("John The Conqueror", "worldwarthesecond");
    }

    public static void buildEmail(String email, String domain) {
        email = email.toLowerCase().replace(" ", "_");
        System.out.println(email + "@" + domain + ".com");
    }
}
