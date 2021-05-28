package day30_arrays;

public class ForEachLoopArray {
    public static void main(String[] args) {
        int[] data = {32, 532, 12, 5454, 22, 123, 543, 999, 321, 3};

        for (int eachNumber : data) {
            System.out.println(eachNumber);
        }

        for (int n : data) {
            System.out.print(n + " ");
        }
        System.out.println();
        System.out.println("-------------FOR LOOP-------------");

        for ( int i = 0; i < data.length; i++) {
            System.out.println(data [i]);
        }
        System.out.println(data[data.length-1]);

        for (int j = data.length-1; j >= 0; j--) {
            System.out.print(data[j] + " ");
        }
    }
}
