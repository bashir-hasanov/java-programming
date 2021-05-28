package saim_problem_set_1;
import java.util.*;
public class OfficeHoursSchedule {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the day:");
        String dayOfWeek = scan.next();

        switch(dayOfWeek) {
            case "Monday","Tuesday","Wednesday":
                System.out.println("Office hours at 5:30 - 6:45 EST");
                break;
            case "Thursday":
                System.out.println("Soft skills day");
                break;
            case "Friday":
                System.out.println("Day off");
                break;
            case "Saturday","Sunday":
                System.out.println("Already a long day, no office hours");
                break;
            default:
                System.out.println("Invalid day given");
        }
    }
}
