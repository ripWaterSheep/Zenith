package game.activity;


import game.components.handlers.Level;
import game.controls.Input;
import game.controls.InputTranslator;
import game.controls.InputVars;
import util.Clock;
import util.UtilMethods;
import util.geometry.Point;

import javax.swing.*;


import static game.components.handlers.Level.*;

public class Activity {

    private Layout layout = new Layout();

    public states ourStates = states.MENU;
    private enum states {
        MENU,
        LEVEL_SELECT,
        SETTINGS,
        GAME,
    }


    private int currLevelIndex = 0;



    public void nextLevel() {
        if (currLevelIndex == getLevels().size()) {
            throw new ArrayIndexOutOfBoundsException();
        }

        currLevelIndex ++;
    }

    public void setLevel(int index) { currLevelIndex = index; }
    public int getCurrLevelIndex() { return currLevelIndex; }


    private void checkForMenuClicks() {
        if (InputVars.leftClickPoint != null) {

        }
    }



    public void init(JPanel panel) {
        setLevel(0);
        Input.init(panel); // listeners



        for(Level l : getLevels()) {
            l.initLevel();
        }

        clock.startClock();
    }



    Clock clock = new Clock(5000);

    public void run() {
        switch (ourStates) {

            case MENU:
                getLevels().get(0).runMenuComponent();


                break;


            case LEVEL_SELECT:
                for (Level l : getLevels()) {
                    l.runMenuComponent();
                }

                break;

        }
    }
}