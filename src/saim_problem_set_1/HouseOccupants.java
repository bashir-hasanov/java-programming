package saim_problem_set_1;
import java.util.*;
public class HouseOccupants {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter house type:");
        String houseType =scan.nextLine();
        int maximumOccupants = 0;

        switch(houseType) {
            case "Tree house":
                maximumOccupants = 1;
                System.out.println("maximumOccupants = " + maximumOccupants);
                break;
            case "Mobile home":
                maximumOccupants = 2;
                System.out.println("maximumOccupants = " + maximumOccupants);
                break;
            case "Apartment":
                maximumOccupants = 4;
                System.out.println("maximumOccupants = " + maximumOccupants);
                break;
            case "Town house":
                maximumOccupants = 6;
                System.out.println("maximumOccupants = " + maximumOccupants);
                break;
            case "Villa":
                maximumOccupants = 8;
                System.out.println("maximumOccupants = " + maximumOccupants);
                break;
            case "Mansion":
                maximumOccupants = 10;
                System.out.println("maximumOccupants = " + maximumOccupants);
                break;
            default:
                System.out.println("Invalid input");
                break;
        }
    }
}
