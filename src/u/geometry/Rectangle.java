package util.geometry;

public class Rectangle {
    public Line top, left, right, bottom;

    public Rectangle(Line topLine, double width) {
        Point topLeft = topLine.startPoint;
        Point topRight = topLine.endPoint;
        Point bottomLeft = topLeft.findExtendedPoint(width, topLine.getSlope());
        Point bottomRight = topRight.findExtendedPoint(width, topLine.getSlope());

        top = topLine;
        left = new Line(topLeft, bottomLeft);
        right = new Line(topRight, bottomRight);
        bottom = new Line(bottomLeft, bottomRight);
    }


    public Point centroid() {
        return new Point((top.startPoint.x + bottom.endPoint.x) / 2, (top.startPoint.y + bottom.endPoint.y) / 2);
    }

    public double getHeight() {
        return bottom.endPoint.y - top.endPoint.y;
    }

    public double getWidth() {
        return right.endPoint.x - left.endPoint.x;
    }

    public double topLeftX() {
        return top.startPoint.x;
    }

    public double topLeftY() {
        return top.startPoint.y;
    }


    public void shiftRectangle(double d) {
        top.shiftLine(d);
        bottom.shiftLine(d);

        left = new Line(top.startPoint, bottom.startPoint);
        right = new Line(top.endPoint, bottom.endPoint);
    }


}
