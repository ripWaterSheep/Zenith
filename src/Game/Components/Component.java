package game.components;

import javax.swing.*;
import java.awt.*;

public abstract class Component {


    // graphics instance used by all components
    protected static Graphics g;

    public static void createGraphics(Graphics g) {
        Component.g = g;
    }


    protected Component(String name, Level level, World world, ImageIcon image, Color color, boolean isCircle, double x, double y, double width, double height) {
        this.name = name;
        this.level = level;
        this.world = world;
        this.image = image;
        this.color = color;
        this.isCircle = isCircle;
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }


    protected String name;

    protected Level level;

    protected World world;

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


    private boolean needed;

    protected void setNeeded() { needed = true; }
    protected void setNotNeeded() { needed = false; }

    public boolean isNeeded() { return needed; }


    public abstract void init();

    public abstract void update(); // updating component fields

    public abstract void draw();
}
