package saim_more_practice;
import java.util.Scanner;
public class CampusTime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the time:");
        int time = input.nextInt();

        if (time >= 8 && time < 23) {
            System.out.println("open");
        } else if ((time >= 0 && time < 8) || time == 23) {
            System.out.println("closed");
        } else {
            System.out.println("invalid time");
        }
    }
}
