package game.components;

import javax.swing.*;
import java.util.ArrayList;


/**
 * Level is to World as World is to Structure, lol
 *
 * Levels are what are used to select which group of worlds will have the opportunity to be shown at one time, which basically means
 * this class is kinda useless but it kinda isn't at the same time.
 *
 * Used for managing worlds, also used for displaying level image in the menu
 *
 * TODO: create a menu class and method for displaying the image, best idea is to create a structure that could be displayed in like a
 * TODO: displayMenuImage() { structure.run() } or something like that
 */
public class Level {

    private static ArrayList<Level> levels = new ArrayList<>();
    public static ArrayList<Level> getLevels() { return levels; }


    public Level(String name, ImageIcon menuImage, ArrayList<World> worlds) {
        this.name = name;
        this.menuImage = menuImage;
        this.worlds = worlds;

        levels.add(this);
    }






    private String name;

    private ImageIcon menuImage;




    private ArrayList<World> worlds;
    public ArrayList<World> getWorlds() { return worlds; }


    private int worldIndex;

    public void setWorld(int index) { this.worldIndex = index; }
    public void nextWorld() { worldIndex++; }
    public World getCurrWorld() { return  getWorlds().get(worldIndex); }





    public void initLevel() {
        getCurrWorld().initWorld();
    }

    public void runLevel() {
        getCurrWorld().updateWorld();
    }
}