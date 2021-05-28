package day29_loop_nested;

public class ClockPractice {
    public static void main(String[] args) {
        for (int min = 1; min <= 5; min++) {
            System.out.println("\n\nminutes = " + min);
            for (int sec = 1; sec <= 60; sec++) {
                System.out.print(sec + ", ");
            }
        }

        for (int minutes = 5; minutes >= 0; minutes--) {
            for (int seconds = 60; seconds >= 0; seconds--) {
                System.out.println(minutes + ":" + seconds);
            }
        }
    }
}
