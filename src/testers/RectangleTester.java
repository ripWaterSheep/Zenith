package testers;

import util.geometry.Line;
import util.geometry.Point;
import util.geometry.Rectangle;

public class RectangleTester {
    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle(new Line(new Point(0, 0), new Point(0, 10)), 10);

        System.out.println(rectangle);
    }
}
