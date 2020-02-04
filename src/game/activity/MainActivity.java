package game.activity;


import game.components.handlers.Level;
import game.controls.Input;
import util.Clock;

import javax.swing.*;


import static game.components.handlers.Level.*;
import static game.components.Menu.*;
import static game.controls.InputVars.*;

public class MainActivity {

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


    private Level currentLevel() {
        return getLevels().get(currLevelIndex);
    }


    private void checkForLevelClicks() {
        int levelClickCounter = 0;
        for (Level l : getLevels()) {
            if (l.getMenuStructure().getRect().contains(leftClickPoint)) {
                setLevel(levelClickCounter);
                ourStates = states.GAME;
            }

            levelClickCounter++;
        }
    }


    private Clock telemetryClock = new Clock(1000);
    private void debugTelemetry() {
        if(telemetryClock.isLapDone()) {
            try {
                System.out.println();
                System.out.println();
                System.out.println("Status: " + ourStates);
                System.out.println("Menu states: " + menu.getOurRequestedScreen());
                System.out.println("Current level: " + getLevels().get(currLevelIndex).getName());
                System.out.println("Current world: " + getLevels().get(currLevelIndex).getCurrWorld().getName());
                System.out.println("Current world structure arr length: " + currentLevel().getCurrWorld().currWorldComponents.size());
                System.out.println();

            } catch (Exception e) {
                System.out.println("something went wrong: \n");
                e.printStackTrace();
            }
        }
    }



    public static Clock gameClock = new Clock(0);



    public void init(JPanel panel) {
        Clock.runInstances();

        setLevel(0);
        Input.init(panel); // listeners



        for(Level l : getLevels()) {
            l.initLevel();
        }

    }




    public void run() {
        debugTelemetry();
        Clock.runInstances();


        switch (ourStates) {

            case MENU:
                menu.run();

                switch (menu.getOurRequestedScreen()) {
                    case MAIN_MENU:
                        return;

                    case SHOP:
                        ourStates = states.SHOP;
                        break;

                    case SETTINGS:
                        ourStates = states.SETTINGS;
                        break;

                    case LEVEL_SELECT:
                        ourStates = states.LEVEL_SELECT;
                        break;

                }


                break;


            case LEVEL_SELECT:
                checkForLevelClicks();
                for (Level l : getLevels()) {
                    l.runMenuComponent();
                }

                break;


            case GAME:
                getLevels().get(currLevelIndex).runLevel();

        }

    }

}