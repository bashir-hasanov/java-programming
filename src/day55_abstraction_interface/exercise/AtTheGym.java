package day55_abstraction_interface.exercise;

public class AtTheGym {
    public static void main(String[] args) {
        // Exercise exercise = new Exercise(); -> Cannot create object/instantiate abstract class
        Exercise exercise = new Running();
        Running running = new Running();
        Swimming swimming = new Swimming();
        FreeWeight freeWeight = new FreeWeight();

        exercise.start();
        exercise.perform();
        System.out.println("Running 30 minutes - calories = " + exercise.getCaloriesCount(30));

        running.start();
        running.perform();
        System.out.println("running.getCaloriesCount(30) = " + running.getCaloriesCount(30));

        swimming.start();
        swimming.perform();
        System.out.println("swimming.getCaloriesCount(30) = " + swimming.getCaloriesCount(30));

        freeWeight.start();
        freeWeight.perform();
        System.out.println("freeWeight.getCaloriesCount(30) = " + freeWeight.getCaloriesCount(30));

    }
}
