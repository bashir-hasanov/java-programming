package alldays_homework;

public class Work2 {
    public static void main(String[] args) {
        int a = 200;
        int b = -a++ + - --a * a-- % 2 + a;
        System.out.println("a = " + a); //199
        System.out.println("b = " + b); //-1
    }
}
