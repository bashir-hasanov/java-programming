package day18_conditins_practice_strings_intro;

public class SeasonFinder {
    public static void main(String[] args) {
        int month = 12;
        switch (month) {
            case 1 : case 2 : case 12:   // we call it OR LOGIC WITH SWITCH
                System.out.println("It is winter.");
                break;
            case 3 : case 4 : case 5 :
                System.out.println("It is spring.");
                break;
            case 6 : case 7 : case 8 :
                System.out.println("It is summer.");
                break;
            case 9 : case 10 : case 11 :
                System.out.println("It is autumn.");
                break;
            default:
                System.out.println("Invalid month number.");
        }
    }
}
