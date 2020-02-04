package game.components.entities;

import game.components.Component;
import util.BetterImageIcon;
import util.Window;

import javax.swing.*;
import java.awt.geom.AffineTransform;

import static game.controls.InputVars.*;

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





    @Override
    public void init() {

    }

    @Override
    public void update() {

    }

    @Override
    public void draw() {
        AffineTransform at = new AffineTransform();
        at.setToRotation(heading);
    }
}
