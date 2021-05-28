package saim_problem_set_1;
import java.util.*;
public class PersonalInformation {
    public static void main(String[] args) {
        Scanner  input = new Scanner(System.in);

        System.out.println("How many people do you live with?");
        int people = input.nextInt();
        if (people < 2) {
            System.out.println("Live with less than 2 people");
        } else if (people >= 3 && people <= 6) {
            System.out.println("Live with 3-6 people");
        } else if (people > 6) {
            System.out.println("Live with more than 6 people.");
        }

        System.out.println("What city do you live in?");
        String city = input.next();
        System.out.println("Do you live in Downtown?");
        boolean isDowntown = input.nextBoolean();
        if (isDowntown) {
            System.out.println("Have you thought about moving to the suburbs?");
            boolean moveToSuburbs = input.nextBoolean();
            if (moveToSuburbs) {
                System.out.println("Do it! It's great!");
            } else {
                System.out.println("You should think about it");
            }
        }

        System.out.println("What is your favourite animal?");
        String favoriteAnimal = input.next();
        System.out.println("Wow " + favoriteAnimal + " is a great animal!");

        System.out.println("How many pets do you want?");
        int numberOfPets = input.nextInt();
        System.out.println("Interesting! Do you want " + numberOfPets + " " + favoriteAnimal + "s?");
    }
}
