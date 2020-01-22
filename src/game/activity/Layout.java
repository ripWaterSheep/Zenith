package game.activity;


import game.components.Menu;
import game.components.handlers.Level;
import game.components.Structure;
import game.components.handlers.World;
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
                add(new World("First World", null, null, new Point(1920, 1080), new ArrayList<>() {{
                    new Structure("Level 1 Structure", null, Color.BLACK, true, 400, 400, 200, 200);
                }}));
            }});


}
