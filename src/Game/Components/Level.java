package game.components;

import javax.swing.*;
import java.util.ArrayList;

public class Level {
    private static ArrayList<Level> levelList = new ArrayList<>();

    public static ArrayList<Level> getLevels() { return levelList; }

    public Level(String name, ImageIcon menuImage, ArrayList<World> worlds) {
        this.name = name;
        this.menuImage = menuImage;
        this.worlds = worlds;
    }


    private String name;

    private ImageIcon menuImage;

    private ArrayList<World> worlds;

    public ArrayList<World> getWorlds() { return worlds; }
}