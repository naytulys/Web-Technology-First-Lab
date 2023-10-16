package merge;

public class IncreaseSequencesMerger {
    public static int[] mergeIncreaseSequencesInsertionPositions(double[] firstSequence, double[] secondSequence) {
        int[] insertionPositions = new int[secondSequence.length];
        int positionsIndex = 0;
        int firstSequenceIndex = 0, secondSequenceIndex = 0;
        while (firstSequenceIndex < firstSequence.length) {
            while (secondSequenceIndex < secondSequence.length &&
                    secondSequence[secondSequenceIndex] <= firstSequence[firstSequenceIndex]) {
                insertionPositions[positionsIndex++] = (firstSequenceIndex + secondSequenceIndex);
                secondSequenceIndex++;
            }
            firstSequenceIndex++;
        }
        while (secondSequenceIndex < secondSequence.length) {
            insertionPositions[positionsIndex++] = (firstSequenceIndex + secondSequenceIndex);
            secondSequenceIndex++;
        }
        return insertionPositions;
    }
}
