package day58_polymorphism;

public class Etsy extends OnlineShop implements HandMade {

    @Override
    public void makeAndSellFromHome() {
        System.out.println("You can make and sell from home with Etsy");
    }

    @Override
    public void buy() {
        System.out.println("Buy from Etsy");
    }

    @Override
    public void sell() {
        System.out.println("Sell on Etsy");
    }

}
