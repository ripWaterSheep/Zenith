package Util;

import javax.swing.*;
import java.awt.*;

public class UtilMethods {

    /**
     * @param container Panel that the frame will run
     */
    public static void runFrame(Container container) {
        JFrame frame = new JFrame("Zenith");
        frame.setSize(1600,900);
        frame.setLocation(0,0);
        frame.setResizable(false);
        frame.setContentPane(container);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }




    public static void sleep(long ms) {
        try {
            Thread.sleep(ms);
        } catch ( Exception ignored) {}
    }


}
