package alldays_homework;
import java.util.Scanner;
public class Work10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Your oxygen level is:");
        int oxygen = input.nextInt();
        if (oxygen > 90) {
            System.out.println(oxygen + " - Your tank is full.");
        } else if (oxygen > 80) {
            System.out.println(oxygen + " - You are still ok.");
        } else if (oxygen > 70) {
            System.out.println(oxygen + " - Don`t go too far!");
        } else if (oxygen > 60) {
            System.out.println(oxygen + " - Start to head back!");
        } else if (oxygen > 50) {
            System.out.println(oxygen + " - Be careful! Now you are at 50.");
        } else {
            System.out.println (oxygen + " - Get back as soon as possible! Now!");
        }
        System.out.println("Oxygen is life!");
    }
}
