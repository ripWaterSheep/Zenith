package testers;

import util.BetterImageIcon;
import util.UtilMethods;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.AffineTransform;
import java.awt.image.AffineTransformOp;
import java.awt.image.BufferedImage;

public class RotateImageTester {
    public static void main(String[] args) {
        UtilMethods.runFrame(new RotateImageTesterPanel());
    }
}

class RotateImageTesterPanel extends JPanel {

    @Override
    public void paintComponent(Graphics g) {
//        BetterImageIcon image = new BetterImageIcon("BattleCruiser");
////        BufferedImage bImage = new BufferedImage("./res/images/Batt")
//
//
//        int drawLocationX = 300;
//        int drawLocationY = 300;
//
//// Rotation information
//
//        double rotationRequired = Math.toRadians (45);
//        double locationX = 12.5;
//        double locationY = 25;
//
//        AffineTransform tx = AffineTransform.getRotateInstance(rotationRequired, locationX, locationY);
//        AffineTransformOp op = new AffineTransformOp(tx, AffineTransformOp.TYPE_BILINEAR);
//
//// Drawing the rotated image at the required drawing locations
//        g.drawImage(op.filter(bImage, null), drawLocationX, drawLocationY, null);
    }
}
