package day09_scanner_practice;

import java.util.Scanner;

public class CentsToDollars {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter value for cents:");
        int cents = scan.nextInt();
        int dollars = cents / 100;
        int remainingCents = cents % 100;
        System.out.println("Cents:\t\t\t\t" + cents);
        System.out.println("Dollars:\t\t\t" + dollars);
        System.out.println("Remaining cents:\t" + remainingCents);
        System.out.println("\nIn " + cents + ": We have " + dollars + " dollar and "
                + remainingCents + " cents.");
    }
}
