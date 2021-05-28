package day25_loop_continued;

public class PrintStarts {
    public static void main(String[] args) {
        for (int stars = 0; stars <=14; stars++ ) {
            System.out.print("* ");
        }

        String myStars = "";
        for (int i = 0; i <=4; i++) {
            myStars += "* ";
            System.out.println("my stars = " + myStars);
        }

    }
}
