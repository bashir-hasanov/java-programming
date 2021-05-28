package saim_more_practice;
import java.util.Scanner;
public class BmiFormula {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
        System.out.println("Enter your mass:");
        double mass = input.nextDouble();
        System.out.println("Enter your height:");
        double height = input.nextDouble();
        double bmi = mass / height * height;
        /*
        Less than 18.5 — Underweight
        From 18.5 to 25 — Normal weight
        From 25 to 30 — Overweight
         More than or equal to 30 — Obese
         */
        if (bmi < 18.5) {
            System.out.println("Underweight");
        } else if (bmi > 18.5 && bmi < 25) {
            System.out.println("Normal weight");
        } else if (bmi > 25 && bmi < 30) {
            System.out.println("Overweight");
        } else if (bmi >= 30) {
            System.out.println("Obese");
        }
        }
    }
