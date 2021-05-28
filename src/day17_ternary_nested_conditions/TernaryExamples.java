package day17_ternary_nested_conditions;

public class TernaryExamples {
    public static void main(String[] args) {
        int score = 70;
        String result = (score > 60) ? "pass":"fail";
        System.out.println("result = " + result);

        String quality = "bad";
        int x = (quality.equals("good")) ? 100:0;
        System.out.println("x = " + x);

        int num = 100;
        char letter = (num < 90) ? 'A':'B';
        System.out.println("letter = " + letter);

        int score1 = 70;
        String result1;
        if (score1 > 60) {
            result1 = "pass";
        } else {
            result1 = "fail";
        }
        System.out.println("result1 = " + result1);


        String quality1 = "bad";
        int x1;
        if (quality1.equals("good")) {
            x1 = 100;
        } else {
            x1 = 0;
        }
        System.out.println("x1 = " + x1);


        int num1 = 100;
        char letter1;
        if (num1 < 90) {
            letter1 = 'A';
        } else {
            letter1 = 'B';
        }
        System.out.println("letter1 = " + letter1);

        double salary = 120000.0;
        String job = (salary >= 100000.0) ? "full time" : "part time";

    }
}
