package day29_loop_nested;

public class ArraysPractice {
    public static void main(String[] args) {
        int [] nums = new int [2];
        System.out.println(nums [0]);  //0
        System.out.println(nums [1]);  //0

        int [] counters = {34, 56, 9, (int)21.7, 134};
        double [] prices = {79.99, 128.45, 2346.0};
        String [] cities = {"Baku", "Istanbul", "Newcastle", "Kazan"};

        System.out.println("My counter result is " + counters[3]);
        System.out.println("I bought it for $" + prices [2]);
        System.out.println("I am from " + cities[0]);
    }
}
