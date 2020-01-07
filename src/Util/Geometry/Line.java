package Util.Geometry;

public class Line {
    public Point startPoint;
    public Point endPoint;

    public Line(Point startPoint, Point endPoint) {
        this.startPoint = startPoint;
        this.endPoint = endPoint;
    }


    /**
     * If line is vertical, return 0. 0 is a debug value
     * If line is horizontal, return 0.000003
     * @return slope of line
     */
    public double getSlope() {
        return (startPoint.y - endPoint.y)/(startPoint.x - endPoint.x);
    }

    /**
     * @return length of line
     */
    public double getLength() {
        return Math.hypot(startPoint.x - endPoint.x, startPoint.y - endPoint.y);
    }


    /**
     * shifts both points along the line
     * @param d distance points are shifted
     */
    public void shiftLine(double d) {
        startPoint.findExtendedPoint(d, getSlope());
        endPoint.findExtendedPoint(d, getSlope());
    }


}
