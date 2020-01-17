package game.activity;


import game.components.Component;
import game.controls.Input;
import util.Clock;

import javax.swing.*;
import java.awt.*;



import static game.components.Level.*;

public class Activity {

    private Layout layout = new Layout();



    private int currLevelIndex = 0;

    public void nextLevel() {
        if (currLevelIndex == getLevels().size()) {
            throw new ArrayIndexOutOfBoundsException();
        }

        currLevelIndex ++;
    }

    public void setLevel(int index) { currLevelIndex = index; }
    public int getCurrLevelIndex() { return currLevelIndex; }






    public void init(JPanel panel) {
        setLevel(0);
        Input.init(panel); // listeners

        getLevels().get(currLevelIndex).initLevel();

        clock.startClock();
    }


    Clock clock = new Clock(5000);
    public void run() {
        getLevels().get(currLevelIndex).runLevel();

        Clock.runInstances();


        if(clock.oneLapDone()) getLevels().get(currLevelIndex).setWorld(1);
        
    }
}
