package check;

import entity.Point;

public class PointChecker {
    private final Point upperRectangleTopLeft;
    private final Point upperRectangleBottomRight;
    private final Point lowerRectangleTopLeft;
    private final Point lowerRectangleBottomRight;

    public PointChecker(Point upperRectangleTopLeft, Point upperRectangleBottomRight, Point lowerRectangleTopLeft, Point lowerRectangleBottomRight) {
        this.upperRectangleTopLeft = upperRectangleTopLeft;
        this.upperRectangleBottomRight = upperRectangleBottomRight;
        this.lowerRectangleTopLeft = lowerRectangleTopLeft;
        this.lowerRectangleBottomRight = lowerRectangleBottomRight;
    }

    public boolean checkArea(Point point) {
        return checkRectangle(upperRectangleTopLeft, upperRectangleBottomRight, point)
                || checkRectangle(lowerRectangleTopLeft, lowerRectangleBottomRight, point);
    }

    private boolean checkRectangle(Point topLeft, Point bottomRight, Point point) {
        return checkCoordinate(topLeft.getX(), bottomRight.getX(), point.getX())
                && checkCoordinate(bottomRight.getY(), topLeft.getY(), point.getY());
    }

    private boolean checkCoordinate(double lowerLimit, double higherLimit, double coordinate) {
        return coordinate >= lowerLimit && coordinate <= higherLimit;
    }
}
