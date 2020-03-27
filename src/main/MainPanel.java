package main;

import game.activity.MainActivity;
import game.components.Component;
import util.UtilMethods;

import javax.swing.*;
import java.awt.*;

public class MainPanel extends JPanel {


    private MainActivity mainActivity = new MainActivity();

    public MainPanel() {
        mainActivity.init(this);

    }


    @Override
    public void paintComponent(Graphics g) {
        g.setColor(Color.WHITE);
        g.fillRect(0, 0, 1920, 1080);

        Component.createGraphics(g);

        mainActivity.run();

        UtilMethods.sleep(10);
        repaint();
    }
}
