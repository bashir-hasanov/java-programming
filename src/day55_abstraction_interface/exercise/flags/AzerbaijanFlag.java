package day55_abstraction_interface.exercise.flags;

import java.awt.*;

public class AzerbaijanFlag extends Flag {


    @Override
    public void draw() {
        Grid grid = new Grid();
        System.out.println("Azerbaijan flag is printed");
        for(int col=0;col<grid.getWd();col++){
            for(int row=0;row<grid.getHt();row++){
                if(row<grid.getHt()/3 ){
                    grid.setColor(row, col, Color.BLUE);
                }else if(row<grid.getHt()/3*2){
                    grid.setColor(row, col, Color.RED);
                }else{
                    grid.setColor(row, col, Color.GREEN);
                }
            }
        }
    }
}
