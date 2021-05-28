package alldays_homework;

public class Work8 {
    public static void main(String[] args) {
        int year = 2000;
        int leap = year % 4;
        if (leap == 0) {
            System.out.println("It is a leap year.");
        } else {
            System.out.println("It is not a leap year.");
        }
    }
}
