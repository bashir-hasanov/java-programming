package day10_shorthand_operators;

public class ShorthandOperators {
    public static void main(String[] args) {
        int cars = 10;
        System.out.println("cars in parking lot = " + cars);

        cars = cars + 2;
        System.out.println("cars in parking lot = " + cars);

        cars += 5;  //5 cars came to the parking lot
        System.out.println("cars in parking lot = " + cars);

        cars -= 6;  //6 cars left the parking lot
        System.out.println("cars in parking lot = " + cars);

        cars = cars - 1;
        cars -= 1;
        System.out.println("cars in parking lot= " + cars);

        int electricCars = 13;
        // cars = cars + electricCars;
        cars += electricCars;
        System.out.println("cars in parking lot " + cars);

        String word = "Java";
        System.out.println("word = " + word);
        word = word + " programming";
        System.out.println("word = " + word);

        //add "is fun"
        word += " is fun";
        System.out.println("word = " + word);

        String selenium = ", but selenium is more fun";
                word += selenium;
        System.out.println("word = " + word);

        word += 12345;
        System.out.println("word = " + word);

        char letters = 'A';
        System.out.println("letters = " + letters);
        letters += 3;
        System.out.println("letters = " + letters);

        letters += 1;
        System.out.println("letters = " + letters);

        double parkingFee = 7.50;
        System.out.println("Normal parkingFee = " + parkingFee);
        //early bird fee is 50% off
        parkingFee /= 2;
        System.out.println("Early bird parkingFee = " + parkingFee);
        parkingFee -= parkingFee;
        System.out.println("Weekend parkingFee = " + parkingFee);
    }
}
