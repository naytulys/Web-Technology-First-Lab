package generation;

public class MatrixGenerator {
    public static double[][] generateMatrix(double[] array) {
        double[][] matrix = new double[array.length][];
        matrix[0] = array;
        for (int i = 1; i < matrix.length; i++) {
            matrix[i] = leftCircleShift(array, i);
        }
        return matrix;
    }

    private static double[] leftCircleShift(double[] array, int pos) {
        double[] shifted = new double[array.length];
        for (int i = 0; i < array.length; i++) {
            shifted[i] = array[(i + pos) % array.length];
        }
        return shifted;
    }
}
