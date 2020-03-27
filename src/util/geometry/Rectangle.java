package util.geometry;


public class Rectangle {
    public Line topLine;
    public Line bottomLine;
    public Line leftLine;
    public Line rightLine;

    public Rectangle(Line topLine, double height) {
        this.topLine = topLine;

        bottomLine = topLine.getParallelLine(height);

        updateLeftAndRight();
    }


    protected void shiftRect(double d) {
        if (topLine.getHeading() > 90 && topLine.getHeading() <= 270) {
            topLine.shiftLine(-d);
            bottomLine.shiftLine(-d);
        } else {
            topLine.shiftLine(d);
            bottomLine.shiftLine(d);
        }

        updateLeftAndRight();
    }


    public void shiftAllPoints(double d, double m, boolean isLeft) {
        if (isLeft) {
            topLine.startPoint = topLine.startPoint.findExtendedPoint(d, m);
            topLine.endPoint = topLine.endPoint.findExtendedPoint(d, m);
            bottomLine.startPoint = bottomLine.startPoint.findExtendedPoint(d, m);
            bottomLine.endPoint = bottomLine.endPoint.findExtendedPoint(d, m);
        } else {
            topLine.startPoint = topLine.startPoint.findExtendedPoint(-d, m);
            topLine.endPoint = topLine.endPoint.findExtendedPoint(-d, m);
            bottomLine.startPoint = bottomLine.startPoint.findExtendedPoint(-d, m);
            bottomLine.endPoint = bottomLine.endPoint.findExtendedPoint(-d, m);
        }

        updateLeftAndRight();
    }


    /**
     * assuming normal rect
     *
     * @param p
     * @return
     */
    public boolean contains(Point p) {
        return p.x > leftLine.startPoint.x && p.x < rightLine.endPoint.x && p.y > topLine.startPoint.y && p.y < bottomLine.endPoint.y;
    }


    protected int[] xPoints() {
        return new int[]{
                (int) topLine.startPoint.x,
                (int) topLine.endPoint.x,
                (int) bottomLine.endPoint.x,
                (int) bottomLine.startPoint.x,
        };
    }


    protected int[] yPoints() {
        return new int[]{
                (int) topLine.startPoint.y,
                (int) topLine.endPoint.y,
                (int) bottomLine.endPoint.y,
                (int) bottomLine.startPoint.y,
        };
    }


    private void updateLeftAndRight() {
        leftLine = new Line(topLine.startPoint, bottomLine.startPoint);
        rightLine = new Line(topLine.endPoint, bottomLine.endPoint);
    }


    @Override
    public String toString() {
        return topLine + " , " + bottomLine;
    }

}
