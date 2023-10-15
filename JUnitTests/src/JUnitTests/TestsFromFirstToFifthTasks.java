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
        double actual = ExpressionCalculator.getInstance().getResult(0.0,0.0);
        double expected =0.5;
        boolean result = Double.compare(actual, expected) == 0;
        assertTrue("Math Expression Task1 failed", result);
    }

    @Test(timeout = 2000)
    public void PointInAreaTask2() throws Exception {
        final Point upperRectangleTopLeft = new Point(-4, 5);
        final Point upperRectangleBottomRight = new Point(4, 0);
        final Point lowerRectangleTopLeft = new Point(-6, 0);
        final Point lowerRectangleBottomRight = new Point(6, -3);
        PointChecker pointChecker = new PointChecker(upperRectangleTopLeft, upperRectangleBottomRight,
                lowerRectangleTopLeft, lowerRectangleBottomRight);
        boolean result = pointChecker.checkArea(new Point(0.0, 0.0));
        assertTrue("PointInArea Task 2 failed", result);
    }
}
