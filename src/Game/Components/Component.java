package game.components;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Area;
import java.awt.geom.Point2D;
import java.util.ArrayList;

public abstract class Component {

    public static ArrayList<? extends Component> components = new ArrayList<>();


    // graphics instance used by all components
    protected static Graphics g;

    public static void createGraphics(Graphics g) {
        Component.g = g;
    }


    protected Component(String name, Level level, World world, ImageIcon image, Color color, Shape shape, double x, double y) {
        this.name = name;
        this.level = level;
        this.world = world;
        this.image = image;
        this.color = color;
        this.shape = shape;
        this.x = x;
        this.y = y;
    }


    protected String name;

    protected Level level;

    protected World world;

    protected ImageIcon image;

    protected Color color;

    protected Shape shape;


    // world location
    protected double x;
    protected double y;

    protected double displayX;
    protected double displayY;


    protected boolean isNeeded() {
        return Boolean.parseBoolean(/* TODO: REPLACE ME */ "");
    }


    protected abstract void init();

    protected abstract void update(); // updating component fields

    protected abstract void draw();
}
