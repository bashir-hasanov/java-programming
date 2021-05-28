package Office_Hours.practice_04_27_2021;
import java.util.*;
public class Armstrong {
    public static void main(String[] args) {
        System.out.println(isArmstrong(153));
    }

    public static boolean isArmstrong(int num) {
        String strNum = "" + num;
        int power = strNum.length();
        int sum = 0;
        for (int i = 0; i < strNum.length(); i++) {
            //  int temp = 1;
            int eachDigit = Integer.parseInt(strNum.substring(i, i+1));
            sum += Math.pow(eachDigit, power);
            //            for(int j = 0; j < power; j++) {
            //                temp *= eachDigit;
            //            }
        }
        return num == sum;
    }
}
