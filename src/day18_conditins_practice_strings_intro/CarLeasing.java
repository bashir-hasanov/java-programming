package day18_conditins_practice_strings_intro;

public class CarLeasing {
    public static void main(String[] args) {
        String make = "Mercedes";
        String model = "E";
        int leasePrice = 0;
        if (make.equals("Mercedes")) {
            System.out.println("The car make is " + make);
            if (model.equals("E")) {
                leasePrice = 500;
                System.out.println("leasePrice = " + leasePrice);
            } else if (model.equals("S")) {
                leasePrice = 400;
                System.out.println("leasePrice = " + leasePrice);
            }

        }else if (make.equals("Audi")) {
            System.out.println("The car make is " + make);
            if (model.equals("SQ5")) {
                leasePrice = 552;
                System.out.println("leasePrice = " + leasePrice);
            } else if (model.equals("A3")) {
                leasePrice = 412;
                System.out.println("leasePrice = " + leasePrice);
            }
        } else {
            System.out.println("Invalid input");
        }
        System.out.println("This is "  + make + " " + model + " offered for $" + leasePrice);
    }
}
