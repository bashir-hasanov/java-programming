package alldays_homework;

public class Employee {
    public static void main(String[] args) {
        String firstName = "Bashir", lastName = "Hasanov",
                month = "March", company = "Tesla",
                fullName = firstName + " " + lastName;
        String jobTitle = "SDET";
        int day = 4, year = 2021, baseSalary = 100000;
        String fullStartDate = day + " " + month + " " + year;
        String email = firstName + day + "@" + company + ".com";
        String address = "100 S Lane Hampton, VA 13312";
        int afterSalary = baseSalary + day * 1000;
        boolean isFullTime = true;

        System.out.println("*****TESLA NEW HIRE INFORMATION*****");
        System.out.println("\tWelcome to " + company + ", dear " + firstName + "!");
        System.out.println("Your start date as a " + jobTitle + " will be on " + fullStartDate + ".");
        System.out.println("You are a full-time employee (" + isFullTime + ") and will be making $" + baseSalary + " per year.");
        System.out.println("The office is located at:\n" + address);
        System.out.println("\n\tOfficial information:");
        System.out.println("New hire name:\t\t" + fullName);
        System.out.println("Starts on:\t\t\t" + fullStartDate);
        System.out.println("Email generated:\t" + email);
        System.out.println("Salary in 3 years:\t$" + afterSalary);

    }
}
