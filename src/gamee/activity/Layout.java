package gamee.activity;

import gamee.componenets.Level;
import gamee.componenets.Structure;
import gamee.componenets.World;

import java.awt.*;

public class Layout {

    World blank = new World();
    Level black = new Level();


    Structure struct = new Structure("test", black, blank, null, Color.black, false, 400, 400, 100, 100);

}
