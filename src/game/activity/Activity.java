package game.activity;


import game.components.Level;
import game.controls.Input;

import javax.swing.*;
import java.awt.*;

public class Activity {

    private Layout layout = new Layout();


    private int currIndex;



    public void init(JPanel panel, Graphics g) {
        Input.init(panel);
        
    }
}
