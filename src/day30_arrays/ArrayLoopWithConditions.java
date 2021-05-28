package day30_arrays;

public class ArrayLoopWithConditions {
    public static void main(String[] args) {
        double[] prices = {22.9, 12.4, 43.12, 65.0, 100.4, 543.23, 98.32, 533.43, 34.23, 124.9, 234.23};
        String[] countries = {"Brazil",
                "China",
                "Cuba",
                "Sweden",
                "France",
                "Vietnam",
                "Albania",
                "Brazil",
                "Portugal",
                "China",
                "Philippines",
                "Philippines",
                "China",
                "Philippines",
                "China",
                "Armenia",
                "Philippines",
                "China",
                "Colombia",
                "Philippines",
                "Honduras",
                "Indonesia",
                "Brazil",
                "China",
                "United States",
                "Russia"};

        for (int num = 0; num < prices.length; num++) {
            if (prices[num] < 100) {
                System.out.print(prices[num] + " ");
            }
        }
        System.out.println();
        System.out.println("-----COUNT OF PRICES MORE THAN 50-----------");
        for (double eachPrice : prices) {
            if (eachPrice < 100) {
                System.out.print(eachPrice + " ");
            }

            if (eachPrice >= 10 && eachPrice <= 70) {
                System.out.print(eachPrice + " ");
            }


        }
        System.out.println();
        for (String countryName : countries) {
            if (countryName.length() >= 7) {
                System.out.print(countryName + ", ");
            }
        }
int[] numbers = {45, 124, 82, 3, 34, 215, 56, 89};
        int max= 0;
        for (int eachNum : numbers) {


            if (max > eachNum) {
                max=eachNum;
            }

        }
        System.out.println(max);

    }
}
