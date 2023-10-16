package starter;

import generation.MatrixGenerator;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        double[] numbers = new double[]{
                1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0
        };
        double[][] matrix = MatrixGenerator.generateMatrix(numbers);
        for (double[] array : matrix) {
            System.out.println(Arrays.toString(array));
        }
    }
}
