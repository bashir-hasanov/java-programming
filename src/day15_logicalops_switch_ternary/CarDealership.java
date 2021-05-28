package day15_logicalops_switch_ternary;

public class CarDealership {
    public static void main(String[] args) {
        double budget = 5000.0;
        double carPrice =9000.0;
        String model = "Tesla";

        if ((model.equals("Honda") || model.equals("Toyota") || model.equals("Tesla")) && carPrice <= budget ) {
            System.out.println("I can afford this " + model + " for " + carPrice);
        } else {
            System.out.println("I don`t buy this " + model);
        }
    }
}
