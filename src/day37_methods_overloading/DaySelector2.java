package day37_methods_overloading;

public class DaySelector2 {
    public static void main(String[] args) {

        System.out.println("What day is it? - It is " + getDayName(5));

        for (int i = 1; i <= 8; i++) {
            System.out.println("What day is it? - It is " + getDayName(i));
        }
       int day = 1;
        System.out.println(day + " - " + getDayName(day));

        String dayName = getDayName(7);
        System.out.println("What day is it? - It is " + dayName);

        String bigDay = getDayName(9);
        if (bigDay == null) {
            System.out.println("Bigday is null for invalid day");
        }

    }

    public static String getDayName(int day) {
        switch (day) {
            case 1:
                return "Monday";
            case 2:
                return "Tuesday";
            case 3:
                return "Wednesday";
            case 4:
                return "Thursday";
            case 5:
                return "Friday";
            case 6:
                return "Saturday";
            case 7:
                return "Sunday";
            default:
                System.out.println("invalid day - " + day);
                return null;
        }
    }
}
