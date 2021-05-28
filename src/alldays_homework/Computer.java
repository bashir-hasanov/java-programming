package alldays_homework;

public class Computer {
    public static void main(String[] args) {
        String brand = "Toshiba Satellite";
        String processor = "Intel(R) core i5 2.50GHz";
        byte ramMemory = 8;
        short storageMemory = 500;
        boolean hasMonitor = true;
        boolean hasWifiCard = false;
        String description = "A computer is an electronic device that manipulates information, or data.";
        double price = 1299.0;
        int cpu = 2501;
        String color = "white";
        byte numberOfMonitors = 1;
        int numberOfUsb = 3;
        boolean hasUsb = true;

        System.out.println("My computer`s brand name is " + brand + ".");
        System.out.println("It has an " + processor + " with " + ramMemory + " GBs of RAM and " +
                storageMemory + " GBs of Storage Memory.");
        System.out.println("It has a monitor (" + hasMonitor + "), but no wifi cards (" + hasWifiCard + ").");
        System.out.println("We can describe my " + brand + " as following: \"" + description + "\"");
        System.out.println("Current price for " + brand + " is $" + price + ".");
        System.out.println("My " + brand + " has " + numberOfMonitors + " monitor and "
                + numberOfUsb + " USB slots.");
        System.out.println("The color of " + brand + " is " + color + " and it has dual " + cpu + "MHz CPUs.");
        System.out.println("If you ask about USB slots, " + hasUsb + ", it has " + numberOfUsb + " of them.");
    }
}