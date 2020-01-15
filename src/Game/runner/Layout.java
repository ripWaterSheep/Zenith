package game.runner;

import game.components.Level;
import game.components.Structure;
import game.components.World;

import java.awt.*;

public class Layout {

    World blank = new World();
    Level black = new Level();


    Structure struct = new Structure("test", black, blank, null, Color.black, false, 400, 400, 100, 100);

}
