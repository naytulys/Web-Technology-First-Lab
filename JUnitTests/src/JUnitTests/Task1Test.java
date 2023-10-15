package JUnitTests;

import calculator.ExpressionCalculator;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

@SuppressWarnings("all")
public class Task1Test {

    @Test(timeout = 2000)
    public void MathExpressionTask1() throws Exception {
        double actual = ExpressionCalculator.getInstance().getResult(0.0,0.0);
        double expected =0.5;
        boolean result = Double.compare(actual, expected) == 0;
        assertTrue("Math Expression Task1 failed", result);
    }
}
