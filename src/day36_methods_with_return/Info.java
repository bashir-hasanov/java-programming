package day36_methods_with_return;
import java.util.*;
public class Info {
    public static void main(String[] args) {
        System.out.println("Full name - " + fullName());

        System.out.println("Is married? - " + isMarried());
        System.out.println("Age = " + getAge());
        fullName();
        isMarried();
        getAge();

        System.out.println(getRandomYear());

        String name = fullName();
        System.out.println("His name is " + name);

        int year = getRandomYear();
        System.out.println("The year now is - " + year);

        if (isMarried()) {
            System.out.println("Married");
        } else {
            System.out.println("Single");
        }
    }

    public static String fullName() {
        System.out.println("Inside full name method");
        return "Mike Smith";
    }

    public static boolean isMarried(){
        return true;

    }

    public static int getAge() {
        int age = 49;
        return age;
    }

    public static int getRandomYear() {
        Random random = new Random();
        int randomYear = random.nextInt(2021);
        return randomYear;
    }
}

