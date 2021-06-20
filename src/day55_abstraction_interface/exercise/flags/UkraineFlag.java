package day55_abstraction_interface.exercise.flags;

import java.awt.*;

public class UkraineFlag extends Flag {

    @Override
    public void draw() {

        System.out.println("Ukraine flag is printed");
        Grid grid = new Grid();
        for(int col=0;col<grid.getWd();col++){
            for(int row=0;row<grid.getHt();row++){
                if(row<grid.getHt()/2 ){
                    grid.setColor(row, col, Color.BLUE);

                }else{
                    grid.setColor(row, col, Color.YELLOW);
                }
            }
        }


    }
}
