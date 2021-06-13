package day53_inheritance.tesla;

public class CarObjects {
    public static void main(String[] args) {
        ElectricCar ec1 = new ElectricCar("Tesla", "Model Y", 48190.0, 2021, 326);
        System.out.println(ec1);
        ec1.drive(50);
        System.out.println(ec1);
        System.out.println("ec1 make = " + ec1.getMake());
        System.out.println("ec1 model = " + ec1.getModel());
        System.out.println("ec1 price = " + ec1.getPrice());
        System.out.println("ec1 year = " + ec1.getYear());
        System.out.println("ec1 range = " + ec1.getRange());

        if (ec1.getPrice() > 10000.0) {
            System.out.println(ec1.getMake() + " - " + ec1.getModel() + " is out of my budget");
        } else {
            System.out.println("purchasing " + ec1.toString());
        }

        System.out.println("count = " + ec1.getCount());

        ElectricCar ec2 = new ElectricCar("Tesla", "Cybertruck", 59900.0, 2022, 300);
        System.out.println(ec2);
        System.out.println("Count = " + ec2.getCount());
        System.out.println("Count with classname = " + ElectricCar.getCount());

    }
}
