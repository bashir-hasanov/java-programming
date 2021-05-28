package alldays_homework;

public class House {
    public static void main(String[] args) {
        String type = "single house";
        byte bedrooms = 4;
        byte bathrooms = 3;
        byte kitchens = 2;
        boolean isBasement = true;
        boolean isAttic = false;
        boolean isPool = true;
        boolean isForSale = false;
        double price = 655000.0;
        String address = "12237 Pender Creek Circle";
        short zipcode = 22033;
        boolean isPark = true;
        char rating = '4';

        System.out.println("HOUSE TYPE: \t\t\tA " + type);
        System.out.println("NUMBER OF BEDROOMS:\t\t" + bedrooms + " bedrooms");
        System.out.println("NUMBER OF BATHROOMS:\t" + bathrooms + " bathrooms");
        System.out.println("NUMBER OF KITCHENS:\t\t" + kitchens + " kitchens");
        System.out.println("IS THERE A BASEMENT?:\t" + isBasement  + " (yes)");
        System.out.println("IS THERE AN ATTIC?:\t\t" + isAttic + " (no)");
        System.out.println("IS THERE A POOL?:\t\t" + isPool + " (yes)");
        System.out.println("IS HOUSE FOR SALE?:\t\t" + isForSale + " (no)");
        System.out.println("PRICE (BEFORE TAX):\t\t$" + price);
        System.out.println("ADDRESS:\t\t\t\t" + address + "\n\t\t\t\t\t\tFairfax, VA");
        System.out.println("ZIP CODE:\t\t\t\t" + zipcode);
        System.out.println("IS THERE PARK NEARBY:\t" + isPark + " (yes)");
        System.out.println("SCHOOL RATING:\t\t\t" + rating + " out of 5");


    }
}
