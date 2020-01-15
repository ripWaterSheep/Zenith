package game.activity;


import game.components.Level;
import game.components.World;

import java.awt.*;


public class Activity {



    


    public void run(Graphics g) {
        for(Level level : Level.getLevels()) {
            for(World world : level.getWorlds()) {
                world.runWorld();
            }
        }
    }
}
