package Game.Components;


import Util.Geometry.Point;

import javax.swing.*;
import java.util.ArrayList;

public abstract class Component {
    public static ArrayList<ArrayList<Component>> componentArrayList = new ArrayList<>();

    public abstract boolean drawable();
    public abstract void init();
    public abstract double index();
    public abstract Point centerPoint();
    public abstract Point displayCenterPoint();
    public abstract ImageIcon image();
    public abstract void run();
}
