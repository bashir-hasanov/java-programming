package day19_class_vs_object_strings;
import java.util.Scanner;
public class FirstName {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first name:");
        String firstName = scan.next();

        if (firstName.startsWith("Mr.")) {
            System.out.println("Man");
        } else if (firstName.startsWith("Mrs.")) {
            System.out.println("Married woman");
        } else if (firstName.startsWith("Ms.")) {
            System.out.println("Single woman");
        } else if (firstName.startsWith("Dr.")) {
            System.out.println("Doctor");
        } else if (firstName.startsWith("Jr.")) {
            System.out.println("Junior");
        } else {
            System.out.println("Not recognized input");
        }
    }
}
