package saim_more_practice;
import java.util.Scanner;
public class BakingContest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter score from the 1st judge:");
        int judgeScore1 = scan.nextInt();
        System.out.println("Enter score from 2nd judge:");
        int judgeScore2 = scan.nextInt();
        System.out.println("Enter score from 3rd judge:");
        int judgeScore3 = scan.nextInt();
        System.out.println("Enter score for other person 1:");
        int otherPersonScore1 = scan.nextInt();
        System.out.println("Enter score for other person 2:");
        int otherPersonScore2 = scan.nextInt();
        int myAverageScore = (judgeScore1 + judgeScore2 + judgeScore3) / 3;

        if (myAverageScore > otherPersonScore1 && myAverageScore > otherPersonScore2) {
            System.out.println("First place!");
        } else if (myAverageScore > otherPersonScore1 && myAverageScore < otherPersonScore2
                || myAverageScore < otherPersonScore1 && myAverageScore > otherPersonScore2) {
            System.out.println("Second place!");
        } else {
            System.out.println("Third place!");
        }
    }
}
