package game.activity;


import game.components.handlers.Level;
import game.components.Structure;
import game.components.handlers.World;

import java.awt.*;
import java.util.ArrayList;

public class Layout {

//
//    Menu ourMenu = new Menu("Main Menu", new ArrayList<>() {{
//        add(new Rectangle(new Line(new Point())))
//    }});


    Level testLevel = new Level("Test Level", null, new ArrayList<>() {{
            add(new World("Test World", null, null, null, new ArrayList<>() {{
                add(new ArrayList<>() {{
                    add(new Structure("Test", null, Color.BLACK, true, 400, 400, 200, 200));
                    add(new Structure("Second test", null, Color.YELLOW, false, 200, 200, 50, 50));
                }});
            }}));

            add(new World("Second test world", null, null, null, new ArrayList<>() {{
                add(new ArrayList<>() {{
                    add(new Structure("jk flushed face", null, Color.GREEN, true, 0, 0 , 400, 400));
                }});
            }}));
        }
    });


}
