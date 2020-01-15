package game.components;

import util.geometry.Point;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class World {
    private static ArrayList<World> worlds = new ArrayList<>();

    public static ArrayList<World> getWorlds() { return worlds; }




    public World(String name, ImageIcon backgroundImage, Color borderColor, Point widthHeight, ArrayList<ArrayList<? extends Component>> allComponents) {
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

    private ArrayList<ArrayList<? extends Component>> currWorldComponents = new ArrayList<>();

    private boolean needed;




    public void runWorld() {
        for(ArrayList<? extends Component> componentsList : currWorldComponents) {
            for(Component e : componentsList) {
                e.update();
                e.draw();
            }
        }
    }
}
