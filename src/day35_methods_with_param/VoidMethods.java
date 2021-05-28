package day35_methods_with_param;

public class VoidMethods {
    public static void main(String[] args) {
        printAtoZ();
        System.out.println();

        displayUsFlag();

        displayUsFlag();

        displayUsFlag();
    }


    public static void printAtoZ() {
        for (char let = 'A' ; let <= 'Z'; let++) {
            System.out.print(let + " ");
        }
    }


    public static void displayUsFlag() {
        System.out.println("------ FLAG OF USA ------");
        String p1 = "* * * * * * ==================================\n * * * * *  ==================================";
        String p2 = "==============================================";
        for (int i = 0; i < 4; i++) {
            System.out.println(p1);
        }
        System.out.println("* * * * * * ==================================");
        for (int i = 0; i < 6; i++) {
            System.out.println(p2);
        }
    }
}
