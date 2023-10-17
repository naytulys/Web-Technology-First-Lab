package JUnitTests;

import calculator.ExpressionCalculator;
import calculator.FunctionCalculator;
import check.PointChecker;
import check.PrimeChecker;
import entity.*;
import generation.MatrixGenerator;
import merge.IncreaseSequencesMerger;
import org.junit.Test;
import search.LongestIncreasingSubsequence;
import sort.CustomSortingAlgorithm;

import java.util.*;

import static org.junit.Assert.assertArrayEquals;
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
            substract = Math.abs(substract);
            result = result && Double.compare(substract, 10e-4) <= 0;
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
        for (int i = 0; i < actualResults.length; i++) {
            result = result && actualResults[i].equals(expectedResults[i]);
        }
        assertTrue("PointInArea Task 2 failed", result);
    }

    @Test(timeout = 2000)
    public void tangentFunctionByStepsTask3FirstTest() throws Exception {
        final Map<Double, Double> expectedResults = new LinkedHashMap<>() {
            {
                put(0.0, 0.0000);
                put(0.5, 0.5463);
                put(1.0, 1.5574);
            }
        };
        int result = 0;
        Map<Double, Double> actualResults = FunctionCalculator.calculate(0.0, 1.0, 0.5);
        for (Map.Entry<Double, Double> entry : expectedResults.entrySet()) {
            if (!actualResults.containsKey(entry.getKey())) {
                result = -1;
                break;
            }
            double substract = actualResults.get(entry.getKey()) - entry.getValue();
            substract = Math.abs(substract);
            if (Double.compare(substract, 10e-4) > 0) {
                result = -2;
            }
        }
        assertTrue("tangent Function By Steps Task 3 First failed actual Map doesnt contains key from expected Map", result != -1);
        assertTrue("tangent Function By Steps Task 3 First failed value by key from actual Map doesnt equal value by the same key from expected Map", result != -2);
        assertTrue("tangent Function By Steps Task 3 failed", result == 0);
    }


    @Test(timeout = 2000)
    public void tangentFunctionByStepsTask3SecondTest() throws Exception {
        final Map<Double, Double> expectedResults = new LinkedHashMap<>() {
            {
                put(0.0, 0.0000);
                put(1.0, 1.5574);
                put(2.0, -2.1850);
                put(3.0, -0.1425);
                put(4.0, 1.1578);
            }
        };
        int result = 0;
        Map<Double, Double> actualResults = FunctionCalculator.calculate(0.0, 4.0, 1.0);
        for (Map.Entry<Double, Double> entry : expectedResults.entrySet()) {
            if (!actualResults.containsKey(entry.getKey())) {
                result = -1;
                break;
            }
            double substract = actualResults.get(entry.getKey()) - entry.getValue();
            substract = Math.abs(substract);
            if (Double.compare(substract, 10e-4) > 0) {
                result = -2;
            }
        }
        assertTrue("tangent Function By Steps Task 3 failed actual Map doesnt contains key from expected Map", result != -1);
        assertTrue("tangent Function By Steps Task 3 failed value by key from actual Map doesnt equal value by the same key from expected Map", result != -2);
        assertTrue("tangent Function By Steps Task 3 failed", result == 0);
    }

    @Test(timeout = 2000)
    public void primesPositionsInArrayTask4FirstTest() throws Exception {
        final int[] inputArray = new int[]{
                1, 2, 5, 9, 10, 13
        };
        final List<Integer> expectedResults = new ArrayList<>() {
            {
                add(1);
                add(2);
                add(5);
            }
        };
        List<Integer> actualResults = PrimeChecker.getPrimesPositionsInArray(inputArray);
        assertArrayEquals("primes Positions In Array Task 4 First Test failed", expectedResults.toArray(), actualResults.toArray());

    }

    @Test(timeout = 2000)
    public void primesPositionsInArrayTask4SecondTest() throws Exception {
        final int[] inputArray = new int[]{
                113, 991
        };
        final List<Integer> expectedResults = new ArrayList<>() {
            {
                add(0);
                add(1);
            }
        };
        List<Integer> actualResults = PrimeChecker.getPrimesPositionsInArray(inputArray);
        assertArrayEquals("primes Positions In Array Task 4 Second Test failed", expectedResults.toArray(), actualResults.toArray());

    }

    @Test(timeout = 2000)
    public void LongestIncreasingSubsequenceTask5FirstTest() throws Exception {
        final int[] inputSequence = new int[]{
                5, 1, 3, 2, 6, 8
        };
        final int expectedResult = 2;
        int actualResults = inputSequence.length - LongestIncreasingSubsequence.getLongestIncreasingSubsequenceLength(inputSequence);
        assertTrue("Longest Increasing Subsequence Task 5 First Test failed", Integer.compare(expectedResult, actualResults) == 0);

    }

    @Test(timeout = 2000)
    public void LongestIncreasingSubsequenceTask5SecondTest() throws Exception {
        final int[] inputSequence = new int[]{
                1, 4, 7, 2, 5, 9, 10, 3, 15
        };
        final int expectedResult = 3;
        int actualResults = inputSequence.length - LongestIncreasingSubsequence.getLongestIncreasingSubsequenceLength(inputSequence);
        assertTrue("Longest Increasing Subsequence Task 5 Second Test failed", Integer.compare(expectedResult, actualResults) == 0);

    }

    @Test(timeout = 2000)
    public void SquareMatrixWhereRowsIsArrayLeftCircleShiftTask6() throws Exception {
        final double[] inputArray = new double[]{
                1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0
        };
        final double[][] expectedResults = new double[][]{
                {1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0},
                {2.0, 3.0, 4.0, 5.0, 6.0, 7.0, 1.0},
                {3.0, 4.0, 5.0, 6.0, 7.0, 1.0, 2.0},
                {4.0, 5.0, 6.0, 7.0, 1.0, 2.0, 3.0},
                {5.0, 6.0, 7.0, 1.0, 2.0, 3.0, 4.0},
                {6.0, 7.0, 1.0, 2.0, 3.0, 4.0, 5.0},
                {7.0, 1.0, 2.0, 3.0, 4.0, 5.0, 6.0},
        };
        double[][] actualResults = MatrixGenerator.generateMatrix(inputArray);
        assertArrayEquals("Square Matrix Where Rows Is Array Left Circle Shift Task 6 failed", expectedResults, actualResults);

    }

    @Test(timeout = 2000)
    public void CustomSortingAlgorithmTask7() throws Exception {
        final double[] inputArray = new double[]{
                1.0, 4.0, 7.0, 2.0, 5.0, 9.0, 10.0, 3.0, 15.0
        };
        final double[] expectedResults = new double[]{
                1.0, 2.0, 3.0, 4.0, 5.0, 7.0, 9.0, 10.0, 15.0
        };
        CustomSortingAlgorithm.sort(inputArray);
        boolean result = Arrays.toString(inputArray).equals(Arrays.toString(expectedResults));
        assertTrue("Custom Sorting Algorithm Task 7 failed", result);
    }

    @Test(timeout = 2000)
    public void mergeIncreaseSequencesInsertionPositionsTask8() throws Exception {
        final double[] firstIncreaseSequence = new double[]{
                1.0, 4.0, 6.0, 9.0
        };
        final double[] secondIncreaseSequence = new double[]{
                2.0, 3.0, 5.0, 8.0, 11.0
        };
        final int[] expectedResults = new int[]{
                1, 2, 4, 6, 8
        };
        int[] actualResults = IncreaseSequencesMerger.mergeIncreaseSequencesInsertionPositions(firstIncreaseSequence, secondIncreaseSequence);
        assertArrayEquals("merge Increase Sequences Insertion Positions Task8 failed", expectedResults, actualResults);
    }

    @Test(timeout = 2000)
    public void CustomSortingAlgorithmTask9() throws Exception {
        BasketOfBalls basketOfBalls = new BasketOfBalls();
        basketOfBalls.addBallInBasket(new Ball(3.5, BallsColors.BLUE));
        basketOfBalls.addBallInBasket(new Ball(1.1, BallsColors.RED));
        basketOfBalls.addBallInBasket(new Ball(2.2, BallsColors.BLUE));
        basketOfBalls.addBallInBasket(new Ball(9.4, BallsColors.BROWN));
        basketOfBalls.addBallInBasket(new Ball(7.2, BallsColors.WHITE));
        basketOfBalls.addBallInBasket(new Ball(0.5, BallsColors.GREEN));
        basketOfBalls.addBallInBasket(new Ball(5.0, BallsColors.BLUE));
        basketOfBalls.addBallInBasket(new Ball(5.5, BallsColors.BLACK));
        basketOfBalls.addBallInBasket(new Ball(6.4, BallsColors.BLUE));
        final double expectedBasketWeight = 40.8;
        final int expectedBlueBallsCount = 4;
        double actualBasketWeight = basketOfBalls.basketWeight();
        int actualBlueBallsCount = basketOfBalls.blueBallsInBasketAmount();
        assertTrue("Custom Sorting Algorithm Task 9 failed",
                Double.compare(expectedBasketWeight, actualBasketWeight) == 0 &&
                        Integer.compare(expectedBlueBallsCount, actualBlueBallsCount) == 0);
    }

    @Test(timeout = 2000)
    public void BookHashCodeMethodsTestTask12() throws Exception {
        List<Book> books = new ArrayList<>();
        books.add(new Book("My first book", "Masha", 142));
        books.add(new Book("My first book", "Masha", 143));
        books.add(new Book("My first book", "Mashaa", 142));
        books.add(new Book("My_first_book", "Masha", 142));
        books.add(new Book("My first book", "Masha", 142));

        boolean[] expectedHashCodesEquals = new boolean[]{
                true, false, false, false, true
        };
        boolean[] actualHashCodesEquals = new boolean[expectedHashCodesEquals.length];
        Book comparationBook = books.get(0);
        for (int i = 0; i < books.size(); i++) {
            actualHashCodesEquals[i] = Integer.compare(comparationBook.hashCode(), books.get(i).hashCode()) == 0;
        }
        assertArrayEquals("Book Hash Code Methods Test Task 12 failed", expectedHashCodesEquals, actualHashCodesEquals);
    }

    @Test(timeout = 2000)
    public void BookEqualMethodsTestTask12() throws Exception {
        List<Book> books = new ArrayList<>();
        books.add(new Book("My first book", "Masha", 142));
        books.add(new Book("My first book", "Masha", 143));
        books.add(new Book("My first book", "Mashaa", 142));
        books.add(new Book("My_first_book", "Masha", 142));
        books.add(new Book("My first book", "Masha", 142));

        boolean[] expectedEqualResults = new boolean[]{
                true, false, false, false, true
        };
        boolean[] actualEqualResults = new boolean[expectedEqualResults.length];
        Book comparationBook = books.get(0);
        for (int i = 0; i < books.size(); i++) {
            actualEqualResults[i] = comparationBook.equals(books.get(i));
        }
        assertArrayEquals("Book Equals Methods Test Task 12 failed", expectedEqualResults, actualEqualResults);
    }

    @Test(timeout = 2000)
    public void ProgrammerBookHashCodeMethodsTestTask13() throws Exception {
        List<ProgrammerBook> programmerBooks = new ArrayList<>();
        programmerBooks.add(new ProgrammerBook("Java", "Herbert Schildt", 200, "English", 100));
        programmerBooks.add(new ProgrammerBook("Jav", "Herbert Schildt", 200, "English", 100));
        programmerBooks.add(new ProgrammerBook("Java", "Herbert Schildta", 200, "English", 100));
        programmerBooks.add(new ProgrammerBook("Java", "Herbert Schildt", 201, "English", 100));
        programmerBooks.add(new ProgrammerBook("Java", "Herbert Schildt", 200, "english", 100));
        programmerBooks.add(new ProgrammerBook("Java", "Herbert Schildt", 200, "English", 101));
        programmerBooks.add(new ProgrammerBook("Java", "Herbert Schildt", 200, "English", 100));
        boolean[] expectedHashCodesEquals = new boolean[]{
                true, false, false, false, false, false, true
        };
        boolean[] actualHashCodesEquals = new boolean[expectedHashCodesEquals.length];
        ProgrammerBook comparationProgBook = programmerBooks.get(0);
        for (int i = 0; i < programmerBooks.size(); i++) {
            actualHashCodesEquals[i] = Integer.compare(comparationProgBook.hashCode(), programmerBooks.get(i).hashCode()) == 0;
        }
        assertArrayEquals("Programmer Book Hash Code Methods Test Task 13 failed", expectedHashCodesEquals, actualHashCodesEquals);
    }

    @Test(timeout = 2000)
    public void ProgrammerBookEqualMethodsTestTask13() throws Exception {
        List<ProgrammerBook> programmerBooks = new ArrayList<>();
        programmerBooks.add(new ProgrammerBook("Java", "Herbert Schildt", 200, "English", 100));
        programmerBooks.add(new ProgrammerBook("Jav", "Herbert Schildt", 200, "English", 100));
        programmerBooks.add(new ProgrammerBook("Java", "Herbert Schildta", 200, "English", 100));
        programmerBooks.add(new ProgrammerBook("Java", "Herbert Schildt", 201, "English", 100));
        programmerBooks.add(new ProgrammerBook("Java", "Herbert Schildt", 200, "english", 100));
        programmerBooks.add(new ProgrammerBook("Java", "Herbert Schildt", 200, "English", 101));
        programmerBooks.add(new ProgrammerBook("Java", "Herbert Schildt", 200, "English", 100));
        boolean[] expectedEqualResults = new boolean[]{
                true, false, false, false, false, false, true
        };
        boolean[] actualEqualResults = new boolean[expectedEqualResults.length];
        Book comparationProgBook = programmerBooks.get(0);
        for (int i = 0; i < programmerBooks.size(); i++) {
            actualEqualResults[i] = comparationProgBook.equals(programmerBooks.get(i));
        }
        assertArrayEquals("Programmer Book Equals Methods Test Task 13 failed", expectedEqualResults, actualEqualResults);
    }

    @Test(timeout = 2000)
    public void BookCloneMethodsTestTask14() throws Exception {
        List<BookWithCloneMethodImplementation> books = new ArrayList<>();
        books.add(new BookWithCloneMethodImplementation("My first book", "Masha", 142));
        books.add(new BookWithCloneMethodImplementation("My first book", "Masha", 143));
        books.add(new BookWithCloneMethodImplementation("My first book", "Mashaa", 142));
        books.add(new BookWithCloneMethodImplementation("My_first_book", "Masha", 142));
        books.add(new BookWithCloneMethodImplementation("My first book", "Masha", 142));
        boolean result = true;
        for (int i = 0; i < books.size(); i++) {
            BookWithCloneMethodImplementation cloneBook = books.get(i).clone();
            result = result && cloneBook.equals(books.get(i));
            result = result && cloneBook.hashCode() == books.get(i).hashCode();
            result = result && cloneBook.toString().equals(books.get(i).toString());
        }
        assertTrue("Book Clone Methods Test Task 14 failed", result);
    }
}
