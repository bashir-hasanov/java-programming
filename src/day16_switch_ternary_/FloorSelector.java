package day16_switch_ternary_;

public class FloorSelector {
    public static void main(String[] args) {
        int floorNum = 3;
        if (floorNum == 1) {
            System.out.println("Floor " + floorNum + " is selected. Companies: Lobby, Verizon, Starbucks.");
        } else if (floorNum == 2) {
            System.out.println("Floor " + floorNum + " is selected. Companies: Cybertek, Nasa, Intelsat.");
        } else if (floorNum == 3) {
            System.out.println("Floor " + floorNum + " is selected. Companies: BofA, Lyft, Kabob Grill.");
        } else {
            System.out.println("Invalid floor - " + floorNum);
        }
        floorNum = 2;
        switch (floorNum) {
            case 1: // if (floorNum == 1)
                System.out.println("Floor " + floorNum + " is selected. Companies: Lobby, Verizon, Starbucks.");
                break; //exit the switch statement
            case 2: // else if (floorNum == 2)
                System.out.println("Floor " + floorNum + " is selected. Companies: Cybertek, Nasa, Intelsat.");
                break;
            case 3:
                System.out.println("Floor " + floorNum + " is selected. Companies: BofA, Lyft.");
                break;
            default: // it is like "else"
                System.out.println("Invalid floor - " + floorNum);
        }
    }
}
