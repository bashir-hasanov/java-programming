package day40_arraylist;
import java.util.*;
public class ArrayListMethods {
    public static void main(String[] args) {
        List<String> shoppingList = new ArrayList<>();
        System.out.println("size = " + shoppingList.size());
        System.out.println("isEmpty = " + shoppingList.isEmpty());

        if (shoppingList.isEmpty()) {
            System.out.println("List is empty. Keep coding Java!");
        } else {
            System.out.println("List is not empty. Code java, then go to mall.");
        }

        shoppingList.add("shoes");
        shoppingList.add("cheap monitor");
        shoppingList.add("scooter");
        shoppingList.add("java book");
        shoppingList.add("jacket");
        shoppingList.add("phone case");
        shoppingList.add("headphones");
        shoppingList.add("sunglasses");
        shoppingList.add("tesla");
        shoppingList.add("wooden spoon");
        shoppingList.remove("tesla");
        shoppingList.remove("wooden spoon");
        System.out.println(shoppingList);

        if (shoppingList.isEmpty()) {
            System.out.println("List is empty. Keep coding Java!");
        } else {
            System.out.println("List is not empty. Code java, then go to mall.");
        }

        int count = shoppingList.size();
        System.out.println("Items to buy = " + count);

        System.out.println("Is shoes in my list? - " + shoppingList.contains("shoes"));

        if (shoppingList.contains("shoes")) {
            System.out.println("Shoes is in the list");
        } else {
            System.out.println("Shoes is not in the list");
        }

        System.out.println("Buying shoes ... $80");

        shoppingList.remove("shoes");
        System.out.println("Shopping list - " + shoppingList );

        System.out.println("Done shopping, get back to coding.");
        shoppingList.clear();
        System.out.println("Shopping list = " + shoppingList);
    }
}