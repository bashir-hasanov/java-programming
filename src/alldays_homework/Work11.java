package alldays_homework;

import java.util.Scanner;

public class Work11 {
    public static void main(String[] args) {
        System.out.println("Enter your initial score:");
        Scanner scan = new Scanner (System.in);
        double score = scan.nextDouble();
        System.out.println("Enter the attempt number:");
        char attempt = scan.next().charAt(0);
        if (attempt == '1') {
            score = 0.9 * score;
            System.out.println("This is your 1st attempt and your score is: " + score);
        } else if (attempt == '2') {
            score = 0.8 * score;
            System.out.println("This is your 2nd attempt and your score is: " + score);
        } else if (attempt == '3') {
            score = 0.7 * score;
            System.out.println("This is your 3rd attempt and your score is: " + score);
        }
    }
}
