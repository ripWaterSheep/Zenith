package testers;

import util.BetterImageIcon;
import util.UtilMethods;

import javax.swing.*;
import java.awt.*;

public class BetterImageIconTester {
    public static void main(String[] args) {
        UtilMethods.runFrame(new BetterImageIconTesterPanel());
    }
}

class BetterImageIconTesterPanel extends JPanel {

    @Override
    public void paintComponent(Graphics g) {
        BetterImageIcon image = new BetterImageIcon("Main_Menu");

        g.drawImage(image.getImage(), 0, 0, 1920, 1080, null);
    }
}
