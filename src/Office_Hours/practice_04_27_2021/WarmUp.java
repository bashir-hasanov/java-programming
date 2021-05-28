package Office_Hours.practice_04_27_2021;
import java.util.*;
public class WarmUp {
    public static void main(String[] args) {
        int num [] = {14, 11, 18, 7, 17, 12, 9, 24};
        for (int i=0; i<num.length-1; i++)  {
            if (num[i]  % 2!=0) {
                if (num[i + 1] % 2 == 0) {
                    int temp = num[i];
                    num[i]=num[i+1];
                    num[i+1]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(num));
    }
}
