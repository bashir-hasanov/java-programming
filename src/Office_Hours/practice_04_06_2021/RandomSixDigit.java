package Office_Hours.practice_04_06_2021;
import java.util.*;
public class RandomSixDigit {
    public static void main(String[] args) {
        Random random = new Random();
        String randomNumber = "";
        while (randomNumber.length() != 6) {
            int eachRandom = random.nextInt(10);
            if (!randomNumber.contains(""+eachRandom)) {
                randomNumber += eachRandom;
            }
        }

        System.out.println("Random number = " + randomNumber);
    }
}
