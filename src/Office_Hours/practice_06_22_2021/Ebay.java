package Office_Hours.practice_06_22_2021;

public class Ebay extends OnlineShopping implements AllowUserToSell{

    @Override
    public void viewCart() {
        System.out.println("Viewing Ebay Cart");
    }

    @Override
    public boolean payForShipping(double price) {
        return price < 100;
    }

    @Override
    public void buyItem() {
        System.out.println("buying from Ebay");
    }

    @Override
    public void returnItem() {
        System.out.println("Returning to Ebay");
    }

    @Override
    public void uploadProduct() {
        System.out.println("Uploading product to Ebay");
    }
}
