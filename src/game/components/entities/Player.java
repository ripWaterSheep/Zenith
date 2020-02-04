package game.components.entities;

import game.components.Component;
import util.BetterImageIcon;
import util.Window;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.AffineTransform;

import static game.controls.InputVars.*;
import static util.UtilMethods.*;

public class Player extends Component {

    public Player(double x, double y, boolean lockedCam) {

        this.lockedCam = lockedCam;
        this.x = x;
        this.y = y;
    }


    /**
     * constructor data fields
     */
    private boolean lockedCam;

    private double x;

    private double y;


    /**
     * non constructor data fields
     */
    private int health;

    private double orientationRad;

    private double heading; // rad

    private final double height = 25;

    private final double width = 25;





    @Override
    public void init() {

    }

    @Override
    public void update() {

    }

    @Override
    public void draw() {
        Graphics2D g2d = (Graphics2D) g;

        g2d.setTransform(rotateAt(heading, x + width/2, y + height/2));
    }
}
