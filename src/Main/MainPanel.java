package main;

import game.runner.Runner;
import util.UtilMethods;

import javax.swing.*;
import java.awt.*;

public class MainPanel extends JPanel {


    Runner runner = new Runner();


    public MainPanel() {
        runner.setup(this);
    }
//

    @Override
    public void paintComponent(Graphics g) {
        runner.run(g);

        UtilMethods.sleep(10);
        repaint();
    }
}
