package game.components;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class Structure extends Component {



    public Structure(String name, Level level, World world, ImageIcon image, Color color, boolean isCircle, double x, double y, double width, double height) {
        super(name, level, world, image, color, isCircle, x, y, width, height);
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
