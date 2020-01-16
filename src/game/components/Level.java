package game.components;

import javax.swing.*;
import java.util.ArrayList;

public class Level {

    private static ArrayList<Level> levels = new ArrayList<>();
    public static ArrayList<Level> getLevels() { return levels; }


    public Level(String name, ImageIcon menuImage, ArrayList<World> worlds) {
        this.name = name;
        this.menuImage = menuImage;
        this.worlds = worlds;

        levels.add(this);
    }


    private int index;




    private String name;

    private ImageIcon menuImage;




    private ArrayList<World> worlds;
    public ArrayList<World> getWorlds() { return worlds; }

    private World currWorld;

    public void setWorld(int index) { this.index = index; }
    public void nextWorld() { index++; }
    public World getCurrWorld() { return  getWorlds().get(index); }





    public void initLevel() {
        currWorld.initWorld();
    }

    public void runLevel() {
        currWorld.updateWorld();
    }
}