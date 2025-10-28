public class Solution27 {
    public static void main(String[] args) {
        int[] nums1 = { 3, 2, 2, 3 };
        int val1 = 3;
        int len1 = new Solution27().removeElement(nums1, val1);
        System.out.println(len1); // Output: 2

        int[] nums2 = { 0, 1, 2, 2, 3, 0, 4, 2 };
        int val2 = 2;
        int len2 = new Solution27().removeElement(nums2, val2);
        System.out.println(len2); // Output: 5
    }

    public int removeElement(int[] nums, int val) {
        int slow = 0;
        for (int fast = 0; fast < nums.length; fast++) {
            if (nums[fast] != val) {
                nums[slow] = nums[fast];
                slow++;
            }
        }
        return slow;
    }
}
