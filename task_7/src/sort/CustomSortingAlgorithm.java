package sort;

import java.util.Arrays;

public class CustomSortingAlgorithm {
    public static double[] sort(double[] array) {
        double[] copiedArray = Arrays.copyOf(array, array.length);
        for (int i = 0; i < copiedArray.length - 1;) {
            if (copiedArray[i] > copiedArray[i + 1]) {
                swap(copiedArray, i, i + 1);
                i = backward(i);
            } else {
                i = forward(i);
            }
        }
        return copiedArray;
    }

    private static int forward(int i) {
        return i + 1;
    }

    private static int backward(int i) {
        return i == 0 ? 0 : i - 1;
    }

    private static void swap(double[] array, int a, int b) {
        double temp = array[a];
        array[a] = array[b];
        array[b] = temp;
    }
}
