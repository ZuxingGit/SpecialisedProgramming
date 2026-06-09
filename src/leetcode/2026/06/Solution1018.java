import java.util.List;
import java.util.ArrayList;

public class Solution1018 {
    public List<Boolean> prefixesDivBy5(int[] nums) {
        List<Boolean> result = new ArrayList<>();
        int prefixSum = 0;

        for (int num : nums) {
            prefixSum = (prefixSum * 2 + num) % 5;
            result.add(prefixSum == 0);
        }

        return result;
    }

    public static void main(String[] args) {
        Solution1018 solution = new Solution1018();

        int[] nums1 = { 0, 1, 1 };
        System.out.println(solution.prefixesDivBy5(nums1)); // Output: [true, false, false]

        int[] nums2 = { 1, 1, 1 };
        System.out.println(solution.prefixesDivBy5(nums2)); // Output: [false, false, false]

        int[] nums3 = { 0, 1, 1, 1, 0 };
        System.out.println(solution.prefixesDivBy5(nums3)); // Output: [true, false, false, false, false]
    }
}
