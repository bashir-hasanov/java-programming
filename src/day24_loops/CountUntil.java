package day24_loops;
import java.util.*;
public class CountUntil {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number:");
        int number = scan.nextInt();
        int count = 1;

        while (count <= number) {
            System.out.print(count + " ");
            count++;
        }
        System.out.println("The process of counting is finished");
    }
}
