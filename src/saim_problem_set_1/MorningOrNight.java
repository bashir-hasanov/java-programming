package saim_problem_set_1;
import java.util.Scanner;
public class MorningOrNight {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the hour:");
        int hour = scan.nextInt();

        String timeOfDay = (hour >= 0 && hour <= 11) ? "Morning":"Night";
        System.out.println("It is " + timeOfDay);

    }
}
