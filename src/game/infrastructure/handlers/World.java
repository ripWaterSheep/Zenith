package game.infrastructure.handlers;

import game.infrastructure.Component;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

import util.geometry.Point;

/**
 * World is basically a glorified ArrayList of Structures
 *
 * In actuality, a world is what is displayed on screen at one time, which is a bunch of components
 *
 * Used for managing structures
 */
public class World {


    public World(String name, ImageIcon backgroundImage, Color borderColor, Point widthHeight, ArrayList<ArrayList<? extends game.infrastructure.Component>> allComponents) {
        this.name = name;
        this.backgroundImage = backgroundImage;
        this.borderColor = borderColor;
        this.widthHeight = widthHeight;
        currWorldComponents = allComponents;
    }



    private String name;

    public String getName() {
        return name;
    }

    private ImageIcon backgroundImage;

    private Color borderColor;

    /**
     * x = width
     * y = height
     */
    private Point widthHeight;

    public ArrayList<ArrayList<? extends game.infrastructure.Component>> currWorldComponents;




    public void initWorld() {
        for (ArrayList<? extends game.infrastructure.Component> cList : currWorldComponents) {
            for (game.infrastructure.Component c : cList) {
                c.init();
            }
        }
    }


    public void updateWorld() {
        for (ArrayList<? extends game.infrastructure.Component> cList : currWorldComponents) {
            for(Component c : cList) {
                c.update();
                c.draw();
            }
        }
    }



}
