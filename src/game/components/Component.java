package game.components;

import javax.swing.*;
import java.awt.*;

public abstract class Component {


    // graphics instance used by all components
    protected static Graphics g;

    public static void createGraphics(Graphics g) {
        Component.g = g;
    }

    /*
    instead of adding an new instance of component to an ArrayList, we will create an ArrayList that we will pass as an argument into the
    World parameter. :o
    Component and shit like that CANNOT be linked to anything else besides a simple drawing of a sprite/struct etc. That is the point of this class,
    to have components easily drawable.

    this is why my code is more alpha than josh's
    flexed on
     */
    protected Component(String name, ImageIcon image, Color color, boolean isCircle, double x, double y, double width, double height) {
        this.name = name;
        this.image = image;
        this.color = color;
        this.isCircle = isCircle;
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }


    protected String name;


    protected ImageIcon image;

    protected Color color;

    protected boolean isCircle;


    // world location
    protected double x;
    protected double y;

    protected double displayX;
    protected double displayY;

    protected double width;
    protected double height;


    /**
     * TODO: IMPLEMENT ABSTRACT VOID FOR RESETTING COMPONENT TO BASE SETTINGS (eg. if player dies and world needs to reset)
     */



    public abstract void init();

    public abstract void update(); // updating component fields

    public abstract void draw();
}
