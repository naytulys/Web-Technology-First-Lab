package search;

public class LongestIncreasingSubsequence {
    public static int getLongestIncreasingSubsequenceLength(int[] inputSequence) {
        int[] subsequenceSizes = new int[inputSequence.length];
        for (int i = 0; i < inputSequence.length; i++) {
            subsequenceSizes[i] = 1;
            for (int j = 0; j < i; j++) {
                if (inputSequence[j] < inputSequence[i]) {
                    subsequenceSizes[i] = Math.max(subsequenceSizes[i], subsequenceSizes[j] + 1);
                }
            }
        }
        int longestIncreaseSubsequenceLength = subsequenceSizes[0];
        for (int i = 1; i < subsequenceSizes.length; i++) {
            longestIncreaseSubsequenceLength = Math.max(longestIncreaseSubsequenceLength, subsequenceSizes[i]);
        }
        return longestIncreaseSubsequenceLength;
    }
}
