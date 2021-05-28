package day16_switch_ternary_;

public class ApartmentLease {
    public static void main(String[] args) {
        System.out.println("******Welcome to Adaire Apartments!******");
        int bedrooms = 2;
        int price = 0;

        switch (bedrooms) {
            case 0:
                System.out.println("Studio apartment is selected.");
                price = 1454;
                break;
            case 1:
                System.out.println(bedrooms + " bedroom apartment is selected.");
                price = 1725;
                break;
            case 2:
                System.out.println(bedrooms + " bedrooms apartment is selected.");
                price = 2899;
                break;
            default:
                System.out.println(bedrooms + " bedrooms apartment is currently unavailable.");
        }
        System.out.println("Starting price is $" + price);
    }
}
