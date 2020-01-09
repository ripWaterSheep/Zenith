package Main;

import Game.Worlds.WorldHandler;

import javax.swing.*;
import java.awt.*;

public class MainPanel extends JPanel {

    MainPanel() {
        GameSession.init(this, getGraphics());
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        while (WorldHandler.isRunning) {
            GameSession.run();
        }
    }
}
