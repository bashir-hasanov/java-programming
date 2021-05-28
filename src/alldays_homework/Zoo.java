package alldays_homework;

public class Zoo {
    public static void main(String[] args) {
        String name = "ZOO", foundedDate = "March 3, 2021",
                startTime = "7:00 AM", closingTime = "5:00 PM";
        boolean openOnHolidays = true, hasAquarium = false;
        int bigCats = 47, hoofed = 53, reptiles = 124,
                birds = 158, primates = 37, employees = 94;
        double ticketAdult = 14.50, ticketChild = 7.50;
        boolean parkingAllowed = true;

        System.out.println("\n**********ZOO BROCHURE**********\n\n-------WELCOME TO THE "
                + name +"!-------\nWe serve you since " + foundedDate + ".\n" +
                employees + " people work for you every day!\n\nEvery day from " +
        startTime + " to " + closingTime + "\n\tOpen on HOLIDAYS (" + openOnHolidays + ")\n\nVisiting the " +
                 name + " you can see:\n" + bigCats + " BIG CATS, " + hoofed + " HOOFED ANIMALS,\n" +
                reptiles + " REPTILES,\t" + birds + " BIRDS,\n\t\t" + primates + " PRIMATES\n\tNO AQUARIUM (" +
                 hasAquarium + ")\n\n\tADULT TICKET: $" + ticketAdult + "\n\tUNDER 13: $" +
                ticketChild + "\n\nFREE PARKING IS AVAILABLE (" + parkingAllowed + ")");

    }
}
