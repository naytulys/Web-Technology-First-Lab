package JUnitTests;

import calculator.ExpressionCalculator;
import check.PointChecker;
import entity.Point;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

@SuppressWarnings("all")
public class TestsFromFirstToFifthTasks {

    @Test(timeout = 2000)
    public void MathExpressionTask1() throws Exception {
        Point[] points = new Point[]{
                new Point(0.0, 0.0),
                new Point(1.0, 1.0),
                new Point(100.0, 0.0)
        };
        final Double[] expectedResults = new Double[]{
                0.5,
                1.91341,
                100.01232
        };
        Double[] actualResults = new Double[expectedResults.length];

        boolean result = true;
        for (int i = 0; i < actualResults.length; i++) {
            actualResults[i] = ExpressionCalculator.getInstance().getResult(points[i].getX(), points[i].getY());
        }
        for (int i = 0; i < actualResults.length; i++) {
            double substract = actualResults[i] - expectedResults[i];
            result = result && Double.compare(substract, 0.001) <= 0;
        }
        assertTrue("Math Expression Task1 failed", result);
    }

    @Test(timeout = 2000)
    public void PointInAreaTask2() throws Exception {
        Point[] points = new Point[]{
                new Point(0.0, 0.0),
                new Point(-4.0, 0.0),
                new Point(5.0, 3.0),
                new Point(-6.0, -3.1),
                new Point(-6.0, -3.0),
                new Point(-6.0, 0.0),
                new Point(0.0, 6.0)
        };
        final Boolean[] expectedResults = new Boolean[]{
                true,
                true,
                false,
                false,
                true,
                true,
                false
        };
        Boolean[] actualResults = new Boolean[expectedResults.length];
        final Point upperRectangleTopLeft = new Point(-4, 5);
        final Point upperRectangleBottomRight = new Point(4, 0);
        final Point lowerRectangleTopLeft = new Point(-6, 0);
        final Point lowerRectangleBottomRight = new Point(6, -3);
        PointChecker pointChecker = new PointChecker(upperRectangleTopLeft, upperRectangleBottomRight,
                lowerRectangleTopLeft, lowerRectangleBottomRight);
        for (int i = 0; i < actualResults.length; i++) {
            actualResults[i] = pointChecker.checkArea(points[i]);
        }
        boolean result = true;
        for (int i = 0; i < actualResults.length; i++){
            result = result && actualResults[i].equals(expectedResults[i]);
        }
        assertTrue("PointInArea Task 2 failed", result);
    }
}
