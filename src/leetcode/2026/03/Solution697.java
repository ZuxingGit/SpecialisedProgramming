import java.util.HashMap;
import java.util.Map;

public class Solution697 {
    public int findShortestSubArray(int[] nums) {
        int degree = 0;
        int minLength = Integer.MAX_VALUE;
        Map<Integer, Integer> countMap = new HashMap<>();
        Map<Integer, Integer> firstIndexMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);

            if (!firstIndexMap.containsKey(num)) {
                firstIndexMap.put(num, i);
            }

            int currentCount = countMap.get(num);
            if (currentCount > degree) {
                degree = currentCount;
                minLength = i - firstIndexMap.get(num) + 1;
            } else if (currentCount == degree) {
                minLength = Math.min(minLength, i - firstIndexMap.get(num) + 1);
            }
        }

        return minLength;
    }

    public static void main(String[] args) {
        Solution697 solution = new Solution697();

        int[] nums = { 1, 2, 2, 3, 1 };
        int result = solution.findShortestSubArray(nums);
        System.out.println(result); // Output: 2

        nums = new int[] { 1, 2, 2, 3, 1, 4, 2 };
        result = solution.findShortestSubArray(nums);
        System.out.println(result); // Output: 6
    }
}
