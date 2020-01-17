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



    Level secondTestLevel = new Level("That other level no one cares about", null, new ArrayList<>() {{
        add(new World("The sad world", null, null, null, new ArrayList<>() {
            {
                add(new ArrayList<>() {{
                    add(new Structure("pepega clap", null, Color.BLUE, true, 200, 200, 200, 200));
                }});
            }}));
        add(new World("the other super sad world", null, null, null, new ArrayList<>() {{
            add(new ArrayList<>() {{
                add(new Structure("pepehands", null, Color.GRAY, false, 0, 0, 800, 800));
            }});
        }}));
    }});

}
