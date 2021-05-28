package day32_arrays_split;

import java.util.Arrays;

public class MallShopping {
    public static void main(String[] args) {
        String[] items  = {"Shoes", "Jacket","Gloves", "Airpods", "iPad", "iphone 11 case" };
        double[] prices = {99.99,     150.0,   9.99,     250.0 ,  439.50,     39.99};
        int[] itemIDs =   {12345 ,    12346,   12347,    12348,    12349,     12350};

        System.out.println("-------Find the index of 'Gloves' in items array.-------");
        System.out.println(Arrays.binarySearch(items, "Gloves"));


        for (int i = 0; i < items.length; i++) {
            // System.out.println(i + " - " + items[i]);
            if (items[i].equalsIgnoreCase("gloves")) {
                System.out.println("Gloves is at the index of " + i);
                break;
            }
        }
        System.out.println("-----Check if items array contains 'iPad'. If yes, print true.-----");
        boolean iPadExists = false;
        for (String item : items) {
            if (item.equalsIgnoreCase("ipad")) {
                iPadExists = true;
                break;
            }
        }
        System.out.println("iPadExists = " + iPadExists);

        System.out.println("-----Print a report of each shopping item.-----");

        for (int a = 0; a < items.length; a++) {
            System.out.println(items[a] + " - $" + prices[a] + " - ID #" + itemIDs[a]);
        }

        System.out.println("-------LOOP FOR JACKET------");
        for ( int b = 0; b < items.length; b++ ) {
            if (items[b].equalsIgnoreCase("jacket")) {
                System.out.println(items[b] + " - $" + prices[b] + " - ID #" + itemIDs[b]);
                break;
            }
        }
    }
}
