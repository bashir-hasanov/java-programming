package saim_loop_practice;
import java.util.*;
public class RandomNumber {
    public static void main(String[] args) {
        Random random = new Random();
        String randomNum = "";

        while (randomNum.length() != 6) {
            int eachRandom = random.nextInt(10);
            if (!randomNum.contains(eachRandom + "")) {
                randomNum += eachRandom;
            }
        }
        System.out.println("Random Number - " + randomNum);
    }
}
