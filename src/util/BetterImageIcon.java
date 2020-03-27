package util;

import javax.swing.*;

public class BetterImageIcon extends ImageIcon {

    public BetterImageIcon(String imageName) {
        super("./res/images/" + imageName + ".png");
    }
}
