package day29_loop_nested;

public class MultiplicationTable {
    public static void main(String[] args) {
        System.out.println("---------------------------------------------------" +
                "---------------------------------------------------------------" +
                "--------------------------------------------");
        for (int outer = 1; outer <= 10; outer++) {
            for (int inner = 1; inner <= 10; inner++) {
                System.out.print(outer + " * " + inner + " = " + outer*inner + "\t |\t");
            }
            System.out.println("");
        }
        System.out.println("-------------------------------------------------" +
                "---------------------------------------------------------------" +
                "----------------------------------------------");
    }
}
