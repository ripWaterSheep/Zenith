package util.geometry;

import java.util.ArrayList;

public class Polygon {
    ArrayList<Line> allLines = new ArrayList<>();

    public Polygon(Point[] allPoints) {
        if (allPoints.length < 2) {
            throw new IllegalArgumentException("retard");
        }

        for (int i = 0; i < allPoints.length - 1; i++) {
            allLines.add(new Line(allPoints[i], allPoints[i + 1]));
        }
    }


    public void shift(double dx, double dy) {
        for (Line e : allLines) {
            e.startPoint.offsetPoint(dx, dy);
            e.endPoint.offsetPoint(dx, dy);
        }
    }
}
