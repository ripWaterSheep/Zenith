package game.components;

import javax.swing.*;
import java.util.ArrayList;

public class Level {


    public Level(String name, ImageIcon menuImage, ArrayList<World> worlds) {
        this.name = name;
        this.menuImage = menuImage;
        this.worlds = worlds;
    }


    private String name;

    private ImageIcon menuImage;

    private ArrayList<World> worlds;


    private World currWorld;

    public World neededWorld() {
        return currWorld;
    }
}
