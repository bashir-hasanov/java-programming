package day25_loop_continued;

public class ForLoopFirst {
    public static void main(String[] args) {
        /**
         * below is infinite loop with for loop like while (true) {
         * for (;;) {
         System.out.println("Java is fun!");
         }
         *
         */
        for (int i = 0; i <= 5; i++) {
            System.out.println("hello world - " + i);
        }
    }
}
