import java.util.ArrayList;
import java.util.List;

public class Solution228 {
    public List<String> summaryRanges(int[] nums) {
        List<String> result = new ArrayList<>();
        if (nums == null || nums.length == 0) {
            return result;
        }

        int start = nums[0]; // Start of the current range

        for (int i = 1; i <= nums.length; i++) {
            // Check if the current number is not consecutive or we reached the end of the
            // array
            if (i == nums.length || nums[i] != nums[i - 1] + 1) {
                if (start == nums[i - 1]) {
                    result.add(String.valueOf(start)); // Single number range
                } else {
                    result.add(start + "->" + nums[i - 1]); // Range [start, nums[i-1]]
                }
                if (i < nums.length) {
                    start = nums[i]; // Start a new range
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Solution228 sol = new Solution228();

        int[] nums1 = { 0, 1, 2, 4, 5, 7 };
        List<String> result1 = sol.summaryRanges(nums1);
        System.out.println(result1);

        int[] nums2 = { 0, 2, 3, 4, 6, 8, 9 };
        List<String> result2 = sol.summaryRanges(nums2);
        System.out.println(result2);
    }
}
