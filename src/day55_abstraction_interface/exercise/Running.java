package day55_abstraction_interface.exercise;

public class Running extends Exercise {

    @Override
    public void perform() {
        System.out.println("Perform Running exercise");
    }

    // we assume avg number of calories per minute while running is 13
    @Override
    public int getCaloriesCount(int minutes) {
        return minutes * 13;
    }

}
