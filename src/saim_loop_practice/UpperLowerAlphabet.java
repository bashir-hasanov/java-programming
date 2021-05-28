package saim_loop_practice;
import java.util.*;
public class UpperLowerAlphabet {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Is it Uppercase or Lowercase?");
        String upperOrLower = input.next();
        System.out.println("Is it in ascending or descending order?");
        String ascendingOrDescending = input.next();
        int start, end;

        if (upperOrLower.equals("uppercase")){
            start = 'A';
            end = 'Z';
        } else {
            start = 'a';
            end = 'z';
        }

        if (ascendingOrDescending.equals("ascending")) {
            for (int i = start; i <= end; i++) {
                System.out.print((char)i + ", ");
            }
        } else {
            for (int i = end; i >= start; i--) {
                System.out.print((char)i + ", ");
            }
        }


    }
}
