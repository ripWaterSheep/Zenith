package Game.Components.Structures.StructList;

import Game.Components.Structures.Structure;
import Util.Geometry.Point;
import jdk.jfr.Unsigned;

import javax.swing.*;


public class Menu extends Structure {


    public Menu()




    @Override
    public boolean clickedIn() {
        return false;
    }

    @Override
    public boolean passable() {
        return false;
    }

    @Override
    public boolean drawable() {
        return false;
    }

    @Override
    public void init() {

    }

    @Override
    public double index() {
        return 0;
    }

    @Override
    public Point centerPoint() {
        return null;
    }

    @Override
    public Point displayCenterPoint() {
        return null;
    }

    @Override
    public ImageIcon image() {
        return null;
    }

    @Override
    public void run() {

    }
}