package util.geometry;

public class Circle {
    public Point centerPoint;
    public double radius;

    public Circle(Point centerPoint, double radius) {
        this.radius = radius;
        this.centerPoint = centerPoint;
    }


    public boolean getPointIn(Point point) {
        return Math.hypot(point.x - centerPoint.x, point.y - centerPoint.y) <= radius;
    }
}
