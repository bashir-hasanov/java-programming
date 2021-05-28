package Office_Hours.practice_04_19_2021;
import java.util.*;
public class RandomArray {

    public static int[] getRandomIntArray(int size, int maxRandomNumber) {
        Random random = new Random();
        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = random.nextInt(maxRandomNumber+1);
        }
        return arr;
    }
}
