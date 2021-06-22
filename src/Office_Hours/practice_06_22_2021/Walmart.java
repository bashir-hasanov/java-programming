package Office_Hours.practice_06_22_2021;

public class Walmart extends OnlineShopping {
    @Override
    public void viewCart() {
        System.out.println("Viewing Amazon Cart");
    }

    @Override
    public boolean payForShipping(double price) {
        return price < 75;
    }

    @Override
    public void buyItem() {
        System.out.println("Buying from Walmart");
    }

    @Override
    public void returnItem() {
        System.out.println("Returning to Walmart");
    }
}
