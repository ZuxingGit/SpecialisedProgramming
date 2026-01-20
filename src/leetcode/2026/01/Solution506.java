import java.util.Arrays;

public class Solution506 {
    public String[] findRelativeRanks(int[] score) {
        int n = score.length;
        Integer[] indices = new Integer[n];
        for (int i = 0; i < n; i++) {
            indices[i] = i;
        }

        Arrays.sort(indices, (a, b) -> Integer.compare(score[b], score[a]));

        String[] result = new String[n];
        for (int rank = 0; rank < n; rank++) {
            int idx = indices[rank];
            if (rank == 0) {
                result[idx] = "Gold Medal";
            } else if (rank == 1) {
                result[idx] = "Silver Medal";
            } else if (rank == 2) {
                result[idx] = "Bronze Medal";
            } else {
                result[idx] = String.valueOf(rank + 1);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Solution506 solution = new Solution506();

        int[] scores = { 5, 4, 3, 2, 1 };
        String[] ranks = solution.findRelativeRanks(scores);
        System.out.println("Relative Ranks: " + Arrays.toString(ranks));

        int[] scores2 = { 10, 3, 8, 9, 4 };
        String[] ranks2 = solution.findRelativeRanks(scores2);
        System.out.println("Relative Ranks: " + Arrays.toString(ranks2));
    }
}
