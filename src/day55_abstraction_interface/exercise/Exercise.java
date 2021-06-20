package day55_abstraction_interface.exercise;

public abstract class Exercise {

    public void start() {
        System.out.println("Warming up an starting the exercise");
    }


    //abstract method - method without body, just signature
    // purpose: letting sub classes implement their own way
    public abstract void perform();


    // another abstract method that concrete sub classes will implement/override
    // param minutes - how long is exercise performed
    // return number of calories burned
    public abstract int getCaloriesCount(int minutes);


}
