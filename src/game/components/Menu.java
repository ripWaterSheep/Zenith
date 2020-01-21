package game.components;

import util.geometry.Rectangle;

import javax.swing.*;
import java.util.ArrayList;

import static game.components.Component.g;
import static util.UtilMethods.*;
import static game.controls.InputVars.*;

public class Menu {
    public static Menu menu;


    public Menu(String name, ArrayList<Rectangle> buttons) {
        menuImage = new ImageIcon(".\\res\\images\\Main_Menu.png");
        this.buttons = buttons;
        menu = this;
    }

    private ImageIcon menuImage;

    private ArrayList<Rectangle> buttons;


    public requestedScreen getOurRequestedScreen() {
        return ourRequestedScreen;
    }


    private requestedScreen ourRequestedScreen;

    public enum requestedScreen {
        LEVEL_SELECT,
        SHOP,
        SETTINGS,
    }


    public void run() {
        g.drawImage(menuImage.getImage(), 0, 0, 1920, 1080, null);

        if (clickedInRect(leftClickPoint, buttons.get(0))) {
            ourRequestedScreen = requestedScreen.LEVEL_SELECT;
        } else if (clickedInRect(leftClickPoint, buttons.get(1))) {
            ourRequestedScreen = requestedScreen.SHOP;
        } else if (clickedInRect(leftClickPoint, buttons.get(2))) {
            ourRequestedScreen = requestedScreen.SETTINGS;
        }
    }
}
