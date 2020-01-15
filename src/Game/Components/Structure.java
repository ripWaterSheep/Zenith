package game.components;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class Structure extends Component {

    private static ArrayList<Structure> structures = new ArrayList<>();

    public static ArrayList<Structure> getStructures() {
        return structures;
    }


    public Structure(String name, Level level, World world, ImageIcon image, Color color, boolean isCircle, double x, double y, double width, double height) {
        super(name, level, world, image, color, isCircle, x, y, width, height);

        structures.add(this);
    }


    @Override
    public void init() {

    }

    @Override
    public void update() {

    }

    @Override
    public void draw() {
        if(!isNeeded()) return;

        g.fillRect((int) x, (int) y, (int) width, (int) height);
    }
}
