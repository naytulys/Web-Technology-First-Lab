package check;

import java.util.ArrayList;
import java.util.List;

public class PrimeChecker {
    public static List<Integer> getPrimesPositionsInArray(int[] array) {
        List<Integer> positions = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            if (isPrime(array[i])) {
                positions.add(i);
            }
        }
        return positions;
    }

    private static boolean isPrime(int value) {
        boolean result = true;
        if (value < 2) {
            result = false;
        } else {
            for (int i = 2; i <= Math.sqrt(value); i++) {
                if (value % i == 0) {
                    result = false;
                    break;
                }
            }
        }
        return result;
    }
}
