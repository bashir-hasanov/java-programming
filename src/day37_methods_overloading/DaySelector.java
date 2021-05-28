package day37_methods_overloading;
import java.util.*;
public class DaySelector {
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        System.out.println("ENTER THE DAY:");
        int day = s.nextInt();
        System.out.println("What day is it? - It is " + getDayName(day));

    }

    public static String getDayName(int day) {
        if (day == 1) {
            return "Monday";
        } else if (day == 2) {
            return "Tuesday";
        } else if (day == 3) {
            return "Wednesday";
        } else if (day == 4) {
            return "Thursday";
        } else if ( day == 5) {
            return "Wednesday";
        } else if (day == 6) {
            return "Wednesday";
        } else if (day == 7) {
            return "Wednesday";
        } else {
            return "invalid day";
        }
    }

    public static String getDayName2(int day) {
        String dayName;
        switch(day) {
            case 1:
                dayName = "Monday";
                break;
            case 2:
                dayName = "Tuesday";
                break;
            case 3:
                dayName = "Wednesday";
                break;
            case 4:
                dayName = "Thursday";
                break;
            case 5:
                dayName = "Friday";
                break;
            case 6:
                dayName = "Saturday";
                break;
            case 7:
                dayName = "Sunday";
                break;
            default:
                System.out.println("invalid day - " + day);
                dayName = null;

        }
        return dayName;
    }
}
