package day06_arithmetic_operators;

public class CarDriverInfo {
    public static void main(String[] args) {


    String carModel = "2013 Ford Escape SE";
    String driverName = "Bashir Hasanov";
    String licenseNum = "C00001111";
    short speed = 150;
    boolean isAutomatic = true;
    char licenseClass = 'D';

    System.out.println("MODEL:\t\t\t\t" + carModel);
    System.out.println("NAME:\t\t\t\t" + driverName);
    System.out.println("LICENSE #:\t\t\t" + licenseNum);
    System.out.println("MAX SPEED:\t\t\t" + speed + " miles" );
    System.out.println("IS IT AUTOMATIC:\t" + isAutomatic + " (yes)");
    System.out.println("LICENSE CLASS:\t\t" + licenseClass + " category");
    System.out.println();
    System.out.println();
    System.out.println("\tCar model is " + carModel + ". The driver`s name is " + driverName + ". His license number is as following: " + licenseNum + ".\nThe maximum speed of " + driverName + "\'s car is " + speed + " miles per hour. ");
//Bashir Hasanov is driving 2013 Ford Escape se.
        System.out.println("\n" + driverName + " is driving " + carModel + ".");
        System.out.println("Current speed is " + speed + " mph.");
        System.out.println("Is it automatic?: \t" + isAutomatic + " (yes)");
        System.out.println("LICENSE CLASS:\t" + licenseClass);
    }
}
