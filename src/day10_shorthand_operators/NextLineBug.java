package day10_shorthand_operators;

import java.util.Scanner;

public class NextLineBug {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter values for rent and month:");
        double rent = scan.nextDouble();
        scan.nextLine(); //this is how we fix known bug
        String month = scan.nextLine();
        System.out.println("Rent: " + rent);
        System.out.println("Month: " + month);

    }
}
