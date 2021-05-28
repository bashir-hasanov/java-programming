package day24_loops;

public class WhileLoopReverse {
    public static void main(String[] args) {
        int count = 5;
        while (count >= 0) {
            System.out.println("count = " + count--);
        }
        System.out.println("Count process is over");

        int unreadSms = 10;
        while (unreadSms > 0) {
            System.out.println("I have in total " + unreadSms + " unread SMS.");
            --unreadSms;
        }
        System.out.println("No more unread SMS messages.");
    }
}
