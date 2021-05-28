package day29_loop_nested;

public class StarsNestedLoop {
    public static void main(String[] args) {
        for (int i = 1; i <=5; i++) {
            System.out.println("");
            for (int j = 1; j <= 10; j++) {
                System.out.print("* ");
            }
        }
        System.out.println("\n");

        for (int m = 1; m <= 10; m++) {
            for (int n = 10; n >= m; n--) {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
}
