package util.geometry;

public class Point {
    public double x;
    public double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }


    public void offsetPoint(double x, double y) {
        this.x += x;
        this.y += y;
    }


    /**
     * @param d distance along line to extended point
     * @param m slope of line
     * @return Point along line with slope m that is d away from THIS point
     */
    public Point findExtendedPoint(double d, double m) {
        if (m != 0) {
            double newX = x + (d / Math.sqrt(1 + m * m));
            double newY = m * (newX - x) + y;

            return new Point(newX, newY);
        } else {
            return new Point(x, y + d);
        }
    }


    public String toString() {
        return "(" + x + "," + y + ")";
    }
}
