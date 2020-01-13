package game.components;

import javax.swing.*;
import java.awt.*;

public class Structure extends Component {


    protected Structure(String name, Level level, World world, ImageIcon image, Color color, Shape shape, double x, double y) {
        super(name, level, world, image, color, shape, x, y);
    }


    @Override
    protected void init() {

    }

    @Override
    protected void update() {

    }

    @Override
    protected void draw() {
        if (Boolean.parseBoolean(/* TODO: ifNeeded() */ "enter me")) ;
    }
}
