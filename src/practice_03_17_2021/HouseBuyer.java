package practice_03_17_2021;

public class HouseBuyer {
    public static void main(String[] args) {
        String name = "Canyon";
        double price, rating;
        boolean gated, allowsPets;

        switch (name) {
            case "Hills":
                price = 89000.0;
                rating = 4.0;
                gated = false;
                allowsPets = true;
                break;
            case "Oaks":
                price = 75000.0;
                rating = 3.5;
                gated = true;
                allowsPets = false;
                break;
            case "Highland":
                price = 150000.0;
                rating = 4.5;
                gated = true;
                allowsPets = true;
                break;
            case "Canyon":
                price = 201000.0;
                rating = 4.8;
                gated = true;
                allowsPets = true;
                break;
            default:
                name = "Invalid name";
                price = 0;
                rating = 0;
                gated = false;
                allowsPets = false;


        }
        System.out.println("name = " + name);
        System.out.println("price = " + price);
        System.out.println("rating = " + rating);
        System.out.println("gated = " + gated);
        System.out.println("allowsPets = " + allowsPets);



 }
}
