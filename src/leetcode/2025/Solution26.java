
public class Solution26 {
    public static void main(String[] args) {
        int[] nums1 = { 1, 1, 2 };
        int len1 = new Solution26().removeDuplicates(nums1);
        System.out.println(len1); // Output: 2

        int[] nums2 = { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 };
        int len2 = new Solution26().removeDuplicates(nums2);
        System.out.println(len2); // Output: 5
    }

    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int slow = 0;
        for (int fast = 1; fast < nums.length; fast++) {
            if (nums[fast] != nums[slow]) {
                slow++;
                nums[slow] = nums[fast];
            }
        }
        return slow + 1;
    }
}
