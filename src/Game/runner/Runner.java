package game.runner;

import game.components.Component;
import game.components.Structure;
import game.controls.Input;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class Runner {


    private Layout layout = new Layout();


    private ArrayList<ArrayList<? extends Component>> allComponents = new ArrayList<>();


    public void setup(JPanel panel, Graphics g) {
        Component.createGraphics(g);
        Input.init(panel);

        allComponents.add(Structure.getStructures());
    }


    public void run() {
        for (ArrayList<? extends Component> a : allComponents) {
            for (Component b : a) {
                b.update();
                b.draw();
            }
        }
    }

}
