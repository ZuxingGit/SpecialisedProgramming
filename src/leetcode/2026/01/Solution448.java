import java.util.List;

public class Solution448 {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int index = Math.abs(nums[i]) - 1;
            if (nums[index] > 0) {
                nums[index] = -nums[index];
            }
        }

        List<Integer> result = new java.util.ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                result.add(i + 1);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Solution448 solution = new Solution448();

        int[] nums1 = { 4, 3, 2, 7, 8, 2, 3, 1 };
        System.out.println("Disappeared numbers: " + solution.findDisappearedNumbers(nums1));

        int[] nums2 = { 1, 1 };
        System.out.println("Disappeared numbers: " + solution.findDisappearedNumbers(nums2));
    }
}
