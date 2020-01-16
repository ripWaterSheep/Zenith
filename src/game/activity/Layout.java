package game.activity;


import game.components.Component;
import game.components.Level;
import game.components.Structure;
import game.components.World;

import java.awt.*;
import java.util.ArrayList;

public class Layout {



    Level testLevel = new Level("Test Level", null, new ArrayList<>() {{
            add(new World("Test World", null, null, null, new ArrayList<>() {{
                add(new ArrayList<>() {{
                    add(new Structure("Test", null, Color.BLACK, true, 400, 400, 200, 200));
                }});
            }}));
        }
    });

}
