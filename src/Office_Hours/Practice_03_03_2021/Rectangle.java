package Office_Hours.Practice_03_03_2021;

import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        /*
        Declare two variables: length and width
         - Calculate the Perimeter 2(l+w)
         - Calculate the Area (w * l)
     - Print properties of the Rectangle
     - Modify to accept Scanner inputs
         */
        // hard coded values:
        // double length = 5;
        // double width = 3;

        //dynamic with Scanner
        System.out.println("Enter your length: ");
        double length = scan.nextDouble();
        System.out.println("Enter your width: ");
        double width = scan.nextDouble();
        double perimeter = 2 * (length + width);
        double area = length * width;

        System.out.println("area = " + area);
        System.out.println("perimeter = " + perimeter);

    }
}
