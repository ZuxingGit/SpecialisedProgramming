import java.util.HashSet;
import java.util.Set;

public class Solution349 {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> resultSet = new HashSet<>();

        for (int num : nums1) {
            set1.add(num);
        }

        for (int num : nums2) {
            if (set1.contains(num)) {
                resultSet.add(num);
            }
        }

        int[] result = new int[resultSet.size()];
        int index = 0;
        for (int num : resultSet) {
            result[index++] = num;
        }

        return result;
    }

    public static void main(String[] args) {
        Solution349 solution = new Solution349();

        int[] nums1 = { 1, 2, 2, 1 };
        int[] nums2 = { 2, 2 };
        int[] result = solution.intersection(nums1, nums2);
        for (int num : result) {
            System.out.println(num + " "); // Output: 2
        }

        int[] nums3 = { 4, 9, 5 };
        int[] nums4 = { 9, 4, 9, 8, 4 };
        int[] result2 = solution.intersection(nums3, nums4);
        for (int num : result2) {
            System.out.print(num + " "); // Output: 9 4 (order may vary)
        }
    }
}
