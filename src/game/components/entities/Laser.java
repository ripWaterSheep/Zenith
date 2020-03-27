package game.components.entities;

import util.enums.EntityEnums;
import util.geometry.Line;
import util.geometry.Point;


import java.awt.*;
import java.util.ArrayList;

import static util.enums.EntityEnums.*;

public class Laser extends Line {
    private static ArrayList<Laser> playerLasers = new ArrayList<>();
    private static ArrayList<Laser> enemyLasers = new ArrayList<>();

    public Laser(Point startPoint, Point endPoint, LaserType laserType) {
        super(startPoint, endPoint);


        if(laserType == LaserType.player) {
            laserColor = Color.GREEN;
            playerLasers.add(this);
        } else {
            laserColor = Color.RED;
            enemyLasers.add(this);
        }
    }


    private Color laserColor;



    public static void runLaserList() {

    }






}
