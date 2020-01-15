package util;

import util.geometry.Point;
import util.geometry.Rectangle;

import javax.swing.*;
import java.awt.*;

public class UtilMethods {

    /**
     * @param container Panel that the frame will run
     */
    public static void runFrame(Container container) {
        JFrame frame = new JFrame("Zenith");
        frame.setSize(800, 800);
        frame.setLocation(0, 0);
        frame.setResizable(false);
        frame.setContentPane(container);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }


    /**
     * sleeps the thread
     *
     * @param ms milliseconds
     */
    public static void sleep(long ms) {
        try {
            Thread.sleep(ms);
        } catch (Exception ignored) {
        }
    }


    public static boolean clickedInRect(Point point, double left, double top, double right, double bottom) {
        return point.x > left && point.x < right && point.y < bottom && point.y > top;
    }

    public static boolean clickedInRect(Point point, Rectangle r) {
        return clickedInRect(point, r.left.startPoint.x, r.top.startPoint.y, r.right.startPoint.x, r.bottom.startPoint.y);
    }


}
