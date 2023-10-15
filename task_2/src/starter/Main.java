package starter;

import check.PointChecker;
import entity.Point;
import reader.ConsoleReader;

public class Main {
    private static final Point upperRectangleTopLeft = new Point(-4, 5);
    private static final Point upperRectangleBottomRight = new Point(4, 0);
    private static final Point lowerRectangleTopLeft = new Point(-6, 0);
    private static final Point lowerRectangleBottomRight = new Point(6, -3);

    public static void main(String[] args) {
        System.out.println("Enter x: ");
        double x = ConsoleReader.readNumber();
        System.out.println("Enter y: ");
        double y = ConsoleReader.readNumber();
        PointChecker checker = new PointChecker(upperRectangleTopLeft, upperRectangleBottomRight,
                lowerRectangleTopLeft, lowerRectangleBottomRight);
        System.out.println(checker.checkArea(new Point(x, y)));
    }
}
