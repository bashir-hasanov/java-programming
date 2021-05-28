package day20_string_manipulation;

import java.util.Locale;

public class StringContains {
    public static void main(String[] args) {
        String company = "Capital one";
        System.out.println(company.contains("i"));    //true
        System.out.println(company.contains("ital")); //true
        System.out.println(company.contains("l o"));   //true

        if (company.contains(" ")) {
            System.out.println("Multiple words company name");
        } else {
            System.out.println("Single word company name");
        }

        String etsyTitle = "Wooden spoon | Etsy";

        if (etsyTitle.contains(" | ")) {
            System.out.println("Pass - title check passed ");
        } else {
            System.out.println("Fail - title check failed");
        }

        String firstName = "Bashir";
        if (firstName.contains("a") && firstName.contains("h")) {
            System.out.println("passed");
        } else {
            System.out.println("failed");
        }

        if (firstName.contains("s") || firstName.contains("r")) {
            System.out.println(firstName + " contains \"s\" or \"r\"");
        } else {
            System.out.println(firstName + " contains none of the given letters");
        }

        String email = "Beshir.hasanov@gmail.com";

        if (email.contains("@") && email.endsWith(".com")) {
            System.out.println("This is a correct email - " + email);
        } else {
            System.out.println("This is not a correct email - " + email);
        }


        if (email.toLowerCase().contains("b")) {
            System.out.println("b is present");
        } else {
            System.out.println("b is not present");
        }
    }
}