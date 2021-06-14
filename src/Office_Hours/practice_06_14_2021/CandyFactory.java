package Office_Hours.practice_06_14_2021;

public class CandyFactory {
    public static void main(String[] args) {
        Candy candy = new Candy("generic", -10, true);
        System.out.println(candy.toString());

        Take5 barOne= new Take5(4, true);
        System.out.println(barOne);

        Twix twixBars = new Twix(8, false);
        System.out.println(twixBars);

        System.out.println(Candy.getTotalNumOfCandies());
        System.out.println(candy.getTotalNumOfCandies());
        System.out.println(barOne.getTotalNumOfCandies());
        System.out.println(twixBars.getTotalNumOfCandies());
    }
}
