package util.geometry;

public class Triangle {
    public Point top;
    public Point left;
    public Point right;

    public Triangle(Point topPoint, Point leftBasePoint, Point rightBasePoint) {
        this.top = topPoint;
        this.left = leftBasePoint;
        this.right = rightBasePoint;
    }


    /**
     * NOT RAW
     *
     * @return middle point of the triangle
     */
    public Point getCentroid() {
        return new Point((top.x + left.x + right.x) / 3, (top.y + left.y + right.y) / 3);
    }

    /**
     * offsets triangle, *RAW*
     *
     * @param dx x offset
     * @param dy y offset
     */
    public void offsetTriangle(double dx, double dy) {
        top = top.findExtendedPoint(dx, 0.0000000003);
        top = top.findExtendedPoint(dy, 0);
        left = left.findExtendedPoint(dx, 0.0000003);
        left = left.findExtendedPoint(dy, 0);
        right = right.findExtendedPoint(dx, 0.0000003);
        right = right.findExtendedPoint(dy, 0);
    }
}
