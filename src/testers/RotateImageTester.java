package testers;

import util.BetterImageIcon;
import util.UtilMethods;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.AffineTransform;

public class RotateImageTester {
    public static void main(String[] args) {
        UtilMethods.runFrame(new RotateImageTesterPanel());
    }
}

class RotateImageTesterPanel extends JPanel {

    @Override
    public void paintComponent(Graphics g) {
        BetterImageIcon image = new BetterImageIcon("spaceship");
        int xPos = 400;
        int yPos = 400;
        double width = 25;
        double height = 25;

        Graphics2D g2d = (Graphics2D) g;
        g2d.drawImage(image.getImage(), xPos, yPos, null);

        AffineTransform at = new AffineTransform();
        at.setToRotation(Math.toRadians(45), xPos + width/2 , yPos + height/2);
        g2d.setTransform(at);

        g2d.drawImage(image.getImage(), xPos, yPos, null);
    }
}
