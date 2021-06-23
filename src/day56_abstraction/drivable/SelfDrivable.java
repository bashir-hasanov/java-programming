package day56_abstraction.drivable;

public interface SelfDrivable {

    void autoDrive();

    default void selfBrake() {

    }

}
