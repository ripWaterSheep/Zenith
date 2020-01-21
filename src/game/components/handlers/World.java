package game.components.handlers;

import game.components.Component;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;


/**
 * World is basically a glorified ArrayList of Structures
 *
 * In actuality, a world is what is displayed on screen at one time, which is a bunch of components
 *
 * Used for managing structures
 */
public class World {


    public World(String name, ImageIcon backgroundImage, Color borderColor, Point widthHeight, ArrayList<ArrayList<? extends game.components.Component>> allComponents) {
        this.name = name;
        this.backgroundImage = backgroundImage;
        this.borderColor = borderColor;
        this.widthHeight = widthHeight;
        currWorldComponents = allComponents;

    }



    private String name;

    private ImageIcon backgroundImage;

    private Color borderColor;

    /**
     * x = width
     * y = height
     */
    private Point widthHeight;

    public ArrayList<ArrayList<? extends game.components.Component>> currWorldComponents;




    public void initWorld() {
        for(ArrayList<? extends game.components.Component> cList : currWorldComponents) {
            for(game.components.Component c : cList) {
                c.init();
            }
        }
    }


    public void updateWorld() {
        for(ArrayList<? extends game.components.Component> cList : currWorldComponents) {
            for(Component c : cList) {
                c.update();
                c.draw();
            }
        }
    }



}
