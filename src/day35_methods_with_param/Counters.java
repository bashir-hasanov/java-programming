package day35_methods_with_param;

public class Counters {
    public static void main(String[] args) {
        count(27);
        count(8);
        int num = 999;
        count(num);
        String word = "wooden spoon";
        count(word.length());

        printAge(1989);
    }

    public static void count(int num) {
        for (int i = 0; i <= num; i++ ) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void printAge(int year) {
        int age = 2021 - year;
        System.out.println("Birth year:" + year + ". Age " + age);
    }
}
