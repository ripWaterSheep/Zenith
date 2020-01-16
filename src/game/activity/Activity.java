package game.activity;


import game.components.Component;
import game.controls.Input;

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




    public void init(JPanel panel, Graphics g) {
        Input.init(panel); // listeners
        Component.createGraphics(g); // give graphics instance to component

        getLevels().get(currLevelIndex).initLevel();
    }


    public void run() {
        getLevels().get(currLevelIndex).runLevel();
    }



}
