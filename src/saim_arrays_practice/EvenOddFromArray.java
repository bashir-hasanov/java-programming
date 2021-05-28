package saim_arrays_practice;

public class EvenOddFromArray {
    public static void main(String[] args) {
        int[] numbers = {4, 1, 3, 12, 7, 26, 13, 132, 140, 23, 51, 78, 1000, -32};
        int countEven = 0, countOdd = 0;

        for (int each : numbers) {

            if (each % 2 == 0) {
                countEven++;
            } else {
                countOdd++;
            }
        }
        System.out.println("Even numbers: " + countEven);
        System.out.println("Odd numbers: " + countOdd);
    }
}
