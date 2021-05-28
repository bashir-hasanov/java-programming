package day35_methods_with_param;

public class MethodsWithParams {
    public static void main(String[] args) {

        for (int i = 0; i <=5; i++) {
            displayValue(12 + i);

        }

        int count = 52;
        displayValue(count);

        greetByName("Bashir");
        String nameB = "Suleyman";
        greetByName(nameB);
    }

    public static void greetByName(String name) {
        System.out.println("Hello " + name + "! How are you today?");
    }

    public static void displayValue(int num) {
        System.out.println("value is " + num);
    }


}

