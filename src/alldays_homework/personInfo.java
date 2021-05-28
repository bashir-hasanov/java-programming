package alldays_homework;

public class personInfo {
    public static void main(String[] args) {
        String name = "Bashir";
        String printname = "Name:\t\t\t\t" + name;
        byte age = 32;
        char gender = 'M';
        boolean student = true;
        short numberOfSiblings = 2;
        long favouriteNumber = 13L;
        int numberOfSeasons = 4;
        double birthDate = 5.13;
        int year = 1989;
        String fullBirthDate = "" + birthDate + "." + year;
        String favouriteQuote = "Have a good mindset!";

        System.out.println(printname);
        System.out.println("Age:\t\t\t\t" + age);
        System.out.println("Gender:\t\t\t\t" + gender);
        System.out.println("Full birthdate:\t\t" + fullBirthDate);
        System.out.println("Is he student?:\t\tyes (" + student + ")");
        System.out.println("Siblings:\t\t\t" + numberOfSiblings);
        System.out.println("Favourite number:\t" + favouriteNumber);
        System.out.println("Number of seasons:\t" + numberOfSeasons);
        System.out.println("Favourite quote:\t" + favouriteQuote);

    }
}
