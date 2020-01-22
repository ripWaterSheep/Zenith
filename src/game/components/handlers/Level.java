package game.components.handlers;

import game.components.Structure;

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





    /**
     *
     * @param name used for identifying the level
     * @param menuStructure structure used for displaying in the level select menu
     * @param worlds ArrayList of worlds in this level
     */
    public Level(String name, Structure menuStructure, ArrayList<World> worlds) {
        this.name = name;
        this.menuStructure = menuStructure;
        this.worlds = worlds;

        levels.add(this);
    }

    private Structure menuStructure;

    public Structure getMenuStructure() {
        return menuStructure;
    }



    private String name;

    public String getName() {
        return name;
    }



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

    public void runMenuComponent() {
        menuStructure.draw();
    }
}