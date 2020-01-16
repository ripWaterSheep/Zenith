package game.components;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class Structure extends Component {

    //public static ArrayList<Structure> structures = new ArrayList<>();


    public Structure(String name, ImageIcon image, Color color, boolean isCircle, double x, double y, double width, double height) {
        super(name, image, color, isCircle, x, y, width, height);

        //structures.add(this);
    }







    @Override
    public void init() {

    }

    @Override
    public void update() {

    }

    @Override
    public void draw() {
        g.fillRect((int) x, (int) y, (int) width, (int) height);
    }
}
