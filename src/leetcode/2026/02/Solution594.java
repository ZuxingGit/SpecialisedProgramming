import java.util.HashMap;
import java.util.Map;

public class Solution594 {
    public int findLHS(int[] nums) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int num : nums) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        int maxLength = 0;
        for (int key : frequencyMap.keySet()) {
            if (frequencyMap.containsKey(key + 1)) {
                int currentLength = frequencyMap.get(key) + frequencyMap.get(key + 1);
                maxLength = Math.max(maxLength, currentLength);
            }
        }

        return maxLength;
    }

    public static void main(String[] args) {
        Solution594 solution = new Solution594();
        int[] nums = { 1, 3, 2, 2, 5, 2, 3, 7 };
        int result = solution.findLHS(nums);
        System.out.println(result); // Should print 5
    }
}
