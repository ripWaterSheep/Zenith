package mainn;

import gamee.activity.Activity;
import util.UtilMethods;

import javax.swing.*;
import java.awt.*;

public class MainPanel extends JPanel {


    Activity activity = new Activity();




    @Override
    public void paintComponent(Graphics g) {





        UtilMethods.sleep(10);
        repaint();
    }
}
