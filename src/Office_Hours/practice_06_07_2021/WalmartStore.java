package Office_Hours.practice_06_07_2021;

import java.util.ArrayList;

public class WalmartStore {
    String location;
    double totalWorth;
    ArrayList<Item> inventory;

    static String companyName;

    static {
        System.out.println("Static block called");
        companyName = "Walmart";
    }

    public WalmartStore(String location) {
        this.location = location;
        this.inventory = new ArrayList<>();
    }

    public WalmartStore(String location, ArrayList<Item> allItems) {
        this.location = location;
        this.inventory = new ArrayList<>(allItems);
        calculateWorth();
    }

    public void calculateWorth() {
        for (Item eachItem : inventory) {
            totalWorth += (eachItem.price * eachItem.quantity);
        }
    }


}
