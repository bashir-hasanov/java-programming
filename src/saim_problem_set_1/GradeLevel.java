package saim_problem_set_1;
import java.util.*;
public class GradeLevel {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the grade level");
        byte gradeLevel = scan.nextByte();

        switch(gradeLevel) {
            case 1,2,3,4,5:
                System.out.println("Elementary school");
                break;
            case 6,7,8:
                System.out.println("Middle school");
                break;
            case 9,10,11,12:
                System.out.println("High school");
                break;
            case 13,14,15,16:
                System.out.println("College");
                break;
            case 17,18:
                System.out.println("Graduate school");
                break;
            default:
                System.out.println("Invalid grade level given.");
        }
    }
}
