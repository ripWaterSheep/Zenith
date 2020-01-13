package game.components;

import util.geometry.Point;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class World {

    public World(String name, ImageIcon backgroundImage, Color borderColor, Point widthHeight, ArrayList<? extends Component> allComponents) {
        this.name = name;
        this.backgroundImage = backgroundImage;
        this.borderColor = borderColor;
        this.widthHeight = widthHeight;



    }



    private String name;

    private ImageIcon backgroundImage;

    private Color borderColor;

    /**
     * x = width
     * y = height
     */
    private Point widthHeight;





}
