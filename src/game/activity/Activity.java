package game.activity;


import game.components.handlers.Level;
import game.controls.Input;
import util.Clock;

import javax.swing.*;


import static game.components.handlers.Level.*;
import static game.components.Menu.*;
import static game.controls.InputVars.*;
import static util.UtilMethods.*;

public class Activity {

    private Layout layout = new Layout();

    public states ourStates = states.MENU;
    private enum states {
        MENU,
        LEVEL_SELECT,
        SETTINGS,
        SHOP,
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


    private void checkForLevelClicks() {
        int levelClickCounter = 0;
        for (Level l : getLevels()) {
            if (clickedInRect(leftClickPoint, l.getMenuStructure().getRect())) {
                setLevel(levelClickCounter);
                ourStates = states.GAME;
            }
            levelClickCounter++;
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
                menu.run();

                switch (menu.getOurRequestedScreen()) {
                    case SHOP:
                        ourStates = states.SHOP;
                        break;

                    case SETTINGS:
                        ourStates = states.SETTINGS;
                        break;

                    case LEVEL_SELECT:
                        ourStates = states.LEVEL_SELECT;
                        break;

                    default:
                        break;
                }


                break;


            case LEVEL_SELECT:
                checkForLevelClicks();
                for (Level l : getLevels()) {
                    l.runMenuComponent();
                }

                break;

        }
    }
}