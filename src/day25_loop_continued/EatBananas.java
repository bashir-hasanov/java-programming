package day25_loop_continued;

public class EatBananas {
    public static void main(String[] args) {
        boolean isHungry = true;
        int bananas = 0;
        int countToFull = 3;

        while (isHungry) {
            bananas++;
            System.out.println("Eating a banana: " + bananas);
            if (bananas == countToFull) {
                isHungry = false;
            }

        }
        System.out.println("We had enough bananas. Let's get back to studying.");
    }

}
