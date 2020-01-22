package util;

import javax.swing.*;
import java.awt.*;

import util.geometry.Rectangle;
import util.geometry.Point;

public class UtilMethods {

    /**
     * Used for more efficient coding with testers
     * @param container Panel that the frame will run
     */
    public static void runFrame(Container container) {
        JFrame frame = new JFrame("Zenith");
        frame.setSize(1366, 768);
        frame.setLocation(0, 0);
        frame.setResizable(false);
        frame.setContentPane(container);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }


    /**
     * sleeps the thread
     * @param ms milliseconds
     */
    public static void sleep(long ms) {
        try {
            Thread.sleep(ms);
        } catch (Exception ignored) {
        }
    }


    /**
     * detecting if a click was in a rect
     * @param point clickPoint
     * @param left left x
     * @param top top y
     * @param right right x
     * @param bottom bottom y
     * @return whether or not it was clicked inside that rectangle
     */
    public static boolean clickedInRect(Point point, double left, double top, double right, double bottom) {
        if (point != null) {
            return point.x > left && point.x < right && point.y < bottom && point.y > top;
        }

        return false;
    }

    /**
     * same thing as the
     * @param point
     * @param r
     * @return
     */
    public static boolean clickedInRect(Point point, Rectangle r) {
        return clickedInRect(point, r.leftLine.startPoint.x, r.topLine.startPoint.y, r.rightLine.startPoint.x, r.bottomLine.startPoint.y);
    }


}
