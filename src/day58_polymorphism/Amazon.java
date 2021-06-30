package day58_polymorphism;

public class Amazon extends OnlineShop implements Prime {

    @Override
    public void buy() {
        System.out.println("Buy from Amazon");
    }

    @Override
    public void sell() {
        System.out.println("Sell on Amazon");
    }


    @Override
    public void primeShipping() {
        System.out.println("Free 2-day shipping for Prime users");
    }
}
