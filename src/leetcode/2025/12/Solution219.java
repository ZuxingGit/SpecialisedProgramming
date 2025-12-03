public class Solution219 {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        java.util.HashSet<Integer> set = new java.util.HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (set.contains(nums[i])) {
                return true;
            }
            set.add(nums[i]);
            if (set.size() > k) {
                // Remove the oldest number to maintain the window size of k
                set.remove(nums[i - k]);
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Solution219 solution = new Solution219();

        // Example test cases
        int[] nums1 = { 1, 2, 3, 1 };
        int k1 = 3;
        System.out.println(solution.containsNearbyDuplicate(nums1, k1)); // true

        int[] nums2 = { 1, 0, 1, 1 };
        int k2 = 1;
        System.out.println(solution.containsNearbyDuplicate(nums2, k2)); // true

        int[] nums3 = { 1, 2, 3, 1, 2, 3 };
        int k3 = 2;
        System.out.println(solution.containsNearbyDuplicate(nums3, k3)); // false
    }
}
