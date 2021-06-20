package day55_abstraction_interface.exercise.flags;

import java.awt.*;

public class FlagDrawing {
    public static void main(String[] args) {

        RussianFlag russianFlag = new RussianFlag();
        russianFlag.draw();

        AzerbaijanFlag azerbaijanFlag = new AzerbaijanFlag();
        azerbaijanFlag.draw();

        UkraineFlag ukraineFlag = new UkraineFlag();
        ukraineFlag.draw();

        FrenchFlag frenchFlag = new FrenchFlag();
        frenchFlag.draw();


    }
}
