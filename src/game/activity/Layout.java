package game.activity;

import game.infrastructure.Menu;
import game.infrastructure.handlers.Level;
import game.infrastructure.Structure;
import game.infrastructure.handlers.World;
import util.geometry.Line;
import util.geometry.Point;
import util.geometry.Rectangle;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class Layout {


    Menu ourMenu = new Menu("Menu test", new ArrayList<>() {{
        int height = 520 - 360;
        add(new Rectangle(new Line(new Point(640, 360), new Point(1260, 360)), height));
        add(new Rectangle(new Line(new Point(640, 580), new Point(1260, 580)), height));
        add(new Rectangle(new Line(new Point(640, 820), new Point(1260, 820)), height));
    }});



    Level firstLevel = new Level("Level 1",
            new Structure("Level 1 Menu Image", new ImageIcon("./res/images/Lvl1.png"), null, false, 100, 100, 268, 177),
            new ArrayList<>() {{
                add(new World("sadface", null, null, new Point(1920, 1080), new ArrayList<>() {{
                    add(new ArrayList<>() {{
                        add(new Structure("evensadder face", null, Color.BLUE, false, 0, 0, 1920, 1080));
                        add(new Structure("red circle", null, Color.RED, true, 350, 350, 200, 200));
                    }});
                }}));
            }});


    Level secondLevel = new Level("Level 2",
            new Structure("Level 2 structure", new ImageIcon("./res/images/Lvl2.png"), null, false, 400, 100, 268, 177),
            new ArrayList<>() {{
                add(new World("second world", null, null, new Point(1920, 1080), new ArrayList<>() {{
                    add(new ArrayList<>() {{
                        add(new Structure("bigboi", null, Color.GREEN, true, 0,0, 800, 800));
                    }});
                }}));
            }});


}
