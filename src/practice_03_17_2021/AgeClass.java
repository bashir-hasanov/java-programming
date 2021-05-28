package practice_03_17_2021;

public class AgeClass {
    public static void main(String[] args) {

        /*
        Have a pre-condition(Outer if): if age > 120 or less
        than 0 ==> invalid entry, and nothing else is checked.

Age groups:
Infant (< 1 year), Toddler (3 - 5), Kid (6 - 9),
 Pre-Teen (10 - 12), Teenager (13 - 17), Young Adult (18 - 20), Adult (21 - 39),
 Young Middle-Aged Adult (40 - 49), Middle-Aged Adult (50 - 54),
 Very Young Senior Citizen (55 - 64), Young Senior Citizen (65 - 74),
  Senior Citizen (75 - 84), Old Senior Citizen (85+)
         */
        int age = 30;
        if (age > 0 || age <120) {
            System.out.println("Valid age");
            if (age <= 2) {
                System.out.println("Infant");
            } else if (age >=3 && age <= 5)  {
                System.out.println("Toddler");
            } else if (age >= 6 && age <=9) {
                System.out.println("Kid");
            } else if (age >= 10 && age <= 12) {
                System.out.println("Pre-teen");
            } else if (age >= 13 && age <= 17) {
                System.out.println("Teenager");
            } else if (age >= 18 && age <= 20) {
                System.out.println("Young adult");
            } else if (age >=21 && age <= 39) {
                System.out.println("Adult");
            } else if (age >= 40 && age <= 49) {
                System.out.println("Young middle-aged adult");
            } else if ( age >= 50 && age <= 54) {
                System.out.println("Middle-aged adult");
            } else if (age >= 55 && age <= 64) {
                System.out.println("Very young senior citizen");
            } else if (age >= 65 && age <= 74) {
                System.out.println("Young senior citizen");
            } else if (age >= 75 && age <= 84) {
                System.out.println("Senior citizen");
            } else if (age >= 85) {
                System.out.println("Old senior citizen");
            }



        }else {
                System.out.println("Invalid age"); }
    }
}
