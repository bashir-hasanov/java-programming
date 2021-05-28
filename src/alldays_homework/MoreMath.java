package alldays_homework;

public class MoreMath  {
    public static void main(String[] args) {
        String name = "Bashir Hasanov";
        String hospital = "Inova";
        int age = 32;
        int days = 7;
        int medicinePerDay = 3;
        int totalDose = days * medicinePerDay;
        int vitamins = 4;
        int injections = 2;
        String market = "Giant";
        int bananas = 29;
        int bananasPerBag = 8;
        int remainder = bananas / bananasPerBag;

        System.out.println("\t\tMy name is " + name + " and I am " + age + " years old.\nToday I visited " +
                hospital + " hospital and the doctor prescribed " + vitamins + " vitamins and " +
                injections + " injections.\nHe told me to take " + medicinePerDay + " medicines per day during the following " +
                " days.\nIt means that I should take the dose of " + totalDose + " medicines in total.\nAfter leaving the "
                + hospital + " hospital I visited "
                + market + " market to do some shopping.\nI bought " +
                bananas + " bananas and put them in bags separately.\nAs I put " + bananasPerBag +
                " bananas in each bag, I had " + remainder + " bananas left.\n------------------------------That`s all, folks!------------------------------");

    }
}
