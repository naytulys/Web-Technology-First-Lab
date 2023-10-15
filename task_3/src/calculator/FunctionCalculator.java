package calculator;

import java.util.LinkedHashMap;
import java.util.Map;

public class FunctionCalculator {
    public static Map<Double, Double> calculate(double a, double b, double step) {
        Map<Double,Double> values = new LinkedHashMap<>();
        while (a <= b) {
            values.put(a, Math.tan(a));
            a += step;
        }
        return values;
    }
}