package day06_arithmetic_operators;

public class MoreMathOperators {
    public static void main(String[] args) {
        short toyotas = 431;
        int hondas = 233;
        byte vw = 2;
        int tesla = 20;
        byte nissan = 1;
        int bmw = 155;
        int totalCarsInParking = toyotas + hondas + vw + tesla + nissan + bmw;

        System.out.println("There are " + totalCarsInParking + " cars in parking lot.");

        String pizza = "Hawaiian";
        int slices = 8;
        int people = 4;
        int slicesPerPerson = slices / people;

        System.out.println("There are " + slicesPerPerson + " slices per person.");

        // We ordered Hawaiian pizza with 8 slices, 4 people ate 2 slices each.

        System.out.println("We ordered " + pizza + " pizza with " + slices + " slices, " + people +
                " people ate " + slicesPerPerson + " slices each.");

    }
}
