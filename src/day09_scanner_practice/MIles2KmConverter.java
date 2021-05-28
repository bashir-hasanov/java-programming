package day09_scanner_practice;

import java.util.Scanner;

public class MIles2KmConverter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the value for miles:");
        double miles = scan.nextDouble();
        System.out.println("Equivalent in  kilometers:");
        double kilometers = miles * 1.609;
        System.out.println(kilometers + "\n");
        System.out.println(miles + " miles = " + kilometers + " kilometers.");
    }
}
