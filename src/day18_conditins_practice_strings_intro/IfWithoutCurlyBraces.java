package day18_conditins_practice_strings_intro;

public class IfWithoutCurlyBraces {
    public static void main(String[] args) {
        String todaysClass = "python";

        if (todaysClass.equals("java"))  // can put todaysClass == "java" but not recommended
            System.out.println(todaysClass + " is fun.");
        else
            System.out.println("It is not java.");

        int score = 1;
        if (score == 1) {
            System.out.println("Lowest score: " + score);
        } else if (score == 2) {
            System.out.println("score is " + score);
        } else if (score == 3) {
            System.out.println("score is " + score);
        } else {
            System.out.println("Invalid score ");
        }


        int a = 3;
        if (a == 1)
            System.out.println("a is " + a);
            System.out.println(a + " is a");

         }
        }

