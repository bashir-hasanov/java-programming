package day24_loops;

public class CatVideo {
    public static void main(String[] args) throws InterruptedException {
        int seconds = 0;
        while (seconds <= 117) {
            System.out.println("Watching cat video at second:" + seconds);
            seconds++;

        }
        System.out.println("Cat video is over. Let`s start a new video.");
    }
}
