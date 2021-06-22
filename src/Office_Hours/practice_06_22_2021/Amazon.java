package Office_Hours.practice_06_22_2021;

public class Amazon extends OnlineShopping implements AllowUserToSell {


    @Override
    public void viewCart() {
        System.out.println("Viewing Amazon Cart");
    }

    @Override
    public boolean payForShipping(double price) {
        return price < 50;
    }

    @Override
    public void buyItem() {
        System.out.println("Buying item from Amazon");
    }

    @Override
    public void returnItem() {
        System.out.println("Returning item to Amazon");
    }

    @Override
    public void uploadProduct() {
        System.out.println("Uploading product to Amazon");
    }
}
