package saim_more_practice;
import java.util.Scanner;
public class StreetLight {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("What is the light?");
        String streetLight = scan.next();

        if (streetLight.equals("Green")) {
            System.out.println("Go!");
        } else if (streetLight.equals("Yellow")) {
            System.out.println("Slow down!");
        } else if (streetLight.equals("Red")) {
            System.out.println("Stop!");
        }


    }
}
