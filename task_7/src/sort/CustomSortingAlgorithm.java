package sort;

import java.util.Arrays;

public class CustomSortingAlgorithm {
    public static void sort(double[] array) {
        for (int i = 0; i < array.length - 1;) {
            if (array[i] > array[i + 1]) {
                swap(array, i, i + 1);
                i = backward(i);
            } else {
                i = forward(i);
            }
        }
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
