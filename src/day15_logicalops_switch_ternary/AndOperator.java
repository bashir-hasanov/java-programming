package day15_logicalops_switch_ternary;

public class AndOperator {
    public static void main(String[] args) {
        boolean onSale = true;
        boolean freeShipping = true;
        String itemName = "Wooden Spoon";
        if (onSale && freeShipping && itemName.equals("Wooden Spoon")) {
            System.out.println("Add the " + itemName + " to cart.");
        } else {
            System.out.println("This " + itemName + " is not available. Continue shopping.");
        }



    }
}
