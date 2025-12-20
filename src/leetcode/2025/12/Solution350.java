import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution350 {
    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer, Integer> countMap = new HashMap<>();
        List<Integer> resultList = new ArrayList<>();

        for (int num : nums1) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }

        for (int num : nums2) {
            if (countMap.getOrDefault(num, 0) > 0) {
                resultList.add(num);
                countMap.put(num, countMap.get(num) - 1);
            }
        }

        int[] result = new int[resultList.size()];
        for (int i = 0; i < resultList.size(); i++) {
            result[i] = resultList.get(i);
        }

        return result;
    }

    public static void main(String[] args) {
        Solution350 solution = new Solution350();

        int[] nums1 = { 1, 2, 2, 1 };
        int[] nums2 = { 2, 2 };
        int[] result = solution.intersect(nums1, nums2);
        for (int num : result) {
            System.out.print(num + " "); // Output: 2 2
        }
        System.out.println();

        int[] nums3 = { 4, 9, 5 };
        int[] nums4 = { 9, 4, 9, 8, 4 };
        int[] result2 = solution.intersect(nums3, nums4);
        for (int num : result2) {
            System.out.print(num + " "); // Output: 4 9 (order may vary)
        }
    }
}