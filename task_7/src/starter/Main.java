package starter;

import sort.CustomSortingAlgorithm;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        final double[] inputArray = new double[]{
                9.0, 4.0, 6.0, 2.0, 4.0, 1.0
        };
        CustomSortingAlgorithm.sort(inputArray);
        System.out.println(Arrays.toString(inputArray));
    }
}
