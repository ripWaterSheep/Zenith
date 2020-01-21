package game.components;

import javax.swing.*;
import java.awt.*;

public class Structure extends Component {

    //public static ArrayList<Structure> structures = new ArrayList<>();


    public Structure(String name, ImageIcon image, Color color, boolean isCircle, double x, double y, double width, double height) {
        super(name, image, color, isCircle, x, y, width, height);

        //structures.add(this);
    }


    public Rectangle getRect() {
        return new Rectangle(new Line(new Point(x, y), new Point(x + width, y + height)), height);
    }




    @Override
    public void init() {

    }

    @Override
    public void update() {

    }

    @Override
    public void draw() {
        g.setColor(color);

        if(image != null) {
            g.drawImage(image.getImage(), (int) x, (int) y, null);
        } else if(isCircle) {
            g.fillOval((int) x, (int) y, (int) width, (int) height);
        } else {
            g.fillRect((int) x, (int) y, (int) width, (int) height);
        }
    }


}
