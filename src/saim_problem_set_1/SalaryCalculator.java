package saim_problem_set_1;

public class SalaryCalculator {
    public static void main(String[] args) {
        double hourlyRate = 53.0;
        int weeklyHours = 40;
        int numberOfWeeks = 52;
        double salary = hourlyRate * weeklyHours * numberOfWeeks;

        if (hourlyRate > 0) {
            if (weeklyHours >= 1 && weeklyHours <= 65) {

                if (numberOfWeeks >= 1 && numberOfWeeks <= 52) {
                    System.out.println("salary = " + salary);
                } else {
                    System.out.println("Number of weeks cannot be less than 1 or greater than 52");
                }
            } else {
                System.out.println("Weekly hours cannot be less than 1 or greater than 65");
            }
        } else {
            System.out.println("Hourly Rate cannot be Negative or Zero");
        }

    }
}
