package day26_loop_practice_more;

public class MultiplicationTable {
    public static void main(String[] args) {
        int num = 8;
        int result = 0;
        if (num <1 || num > 10) {
            System.out.println("Invalid number");
            return; //exit main method, stop the program
        }
        for (int i = 1; i <= 9; i++) {
            result = i * num;
            System.out.println(num + " * " + i + " = " + result);

            }

    }
}
