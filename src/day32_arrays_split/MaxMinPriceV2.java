package day32_arrays_split;

public class MaxMinPriceV2 {
    public static void main(String[] args) {
        String[] items  = {"Shoes", "Jacket","Gloves", "Airpods", "iPad", "iphone 11 case" };
        double[] prices = {99.99,     150.0,   9.99,     250.0 ,  439.50,     39.99};
        int[] itemIDs =   {12345 ,    12346,   12347,    12348,    12349,     12350};
        System.out.println("----Find and print details of most expensive item");
        double maximum = prices[0];
        double miniumum = prices[0];
        int idxOfMax = 0, idxOfMin = 0;

        for ( int i = 0; i < prices.length; i++) {
            if (prices [i] > maximum) {
                maximum = prices[i];
                idxOfMax = i;
            }
            if (prices[i] < miniumum) {
                miniumum = prices[i];
                idxOfMin = i;
            }
        }
        System.out.println("Most expensive item - " + items[idxOfMax] + " - $" + prices[idxOfMax] +
                " - ID #" + itemIDs[idxOfMax]);
        System.out.println("Cheapest item - " + items[idxOfMin] + " - $" + prices[idxOfMin] +
                " - ID #" + itemIDs[idxOfMin]);

    }
}
