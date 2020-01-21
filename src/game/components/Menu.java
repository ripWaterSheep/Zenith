package game.components;

import util.geometry.Rectangle;

import javax.swing.*;
import java.util.ArrayList;

import static game.components.Component.g;

public class Menu {

    public Menu(String name, ArrayList<Rectangle> buttons) {
        menuImage = new ImageIcon(".\\res\\images\\Main_Menu.png");
        this.buttons = buttons;
    }

    private ImageIcon menuImage;

    private ArrayList<Rectangle> buttons;


    public void run() {
        g.drawImage(menuImage.getImage(), 0, 0, 1920, 1080, null);
    }
}
