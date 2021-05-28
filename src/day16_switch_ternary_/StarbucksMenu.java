package day16_switch_ternary_;

public class StarbucksMenu {
    public static void main(String[] args) {
        String size = "tall";
        double price = 0;
        int calories = 0;
        switch (size) {
            case "tall":
                System.out.println(size + " cappuccino please");
                 price = 3.69;
                 calories = 90;
                 break;
            case "grande":
                System.out.println(size + " cappuccino please ");
                price = 3.99;
                calories = 120;
                break;
            case "venti":
                System.out.println(size + " cappuccino please");
                price = 4.59;
                calories = 150;
                break;
            default:
                System.out.println("We don`t serve that size of cappuccino.");
                break; //optional, if default is at the end
        }
        System.out.println("Total price: $" + price);
        System.out.println("Calories that you consume: " + calories);

    }
}
