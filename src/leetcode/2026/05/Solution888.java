import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Solution888 {
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int sumAlice = 0;
        for (int size : aliceSizes) {
            sumAlice += size;
        }

        int sumBob = 0;
        for (int size : bobSizes) {
            sumBob += size;
        }

        int diff = (sumAlice - sumBob) / 2;

        Set<Integer> bobSet = new HashSet<>();
        for (int size : bobSizes) {
            bobSet.add(size);
        }

        for (int size : aliceSizes) {
            if (bobSet.contains(size - diff)) {
                return new int[] { size, size - diff };
            }
        }

        return new int[0]; // This line should never be reached
    }

    public static void main(String[] args) {
        Solution888 solution = new Solution888();

        int[] aliceSizes1 = { 1, 1 };
        int[] bobSizes1 = { 2, 2 };
        System.out.println(Arrays.toString(solution.fairCandySwap(aliceSizes1, bobSizes1))); // Output: [1, 2]

        int[] aliceSizes2 = { 1, 2 };
        int[] bobSizes2 = { 2, 3 };
        System.out.println(Arrays.toString(solution.fairCandySwap(aliceSizes2, bobSizes2))); // Output: [1, 2]

        int[] aliceSizes3 = { 2 };
        int[] bobSizes3 = { 1, 3 };
        System.out.println(Arrays.toString(solution.fairCandySwap(aliceSizes3, bobSizes3))); // Output: [2, 3]
    }
}
