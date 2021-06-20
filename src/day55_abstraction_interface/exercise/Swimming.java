package day55_abstraction_interface.exercise;

public class Swimming extends Exercise {

    @Override
    public void perform() {
        System.out.println("Perform Swimming exercise");
    }

    @Override
    public int getCaloriesCount(int minutes) {
        return minutes * 15;
    }
}
