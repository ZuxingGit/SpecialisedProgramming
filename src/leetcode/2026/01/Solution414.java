public class Solution414 {
    public int thirdMax(int[] nums) {
        Integer max1 = null;
        Integer max2 = null;
        Integer max3 = null;

        for (Integer num : nums) {
            if (num.equals(max1) || num.equals(max2) || num.equals(max3)) {
                continue;
            }
            if (max1 == null || num > max1) {
                max3 = max2;
                max2 = max1;
                max1 = num;
            } else if (max2 == null || num > max2) {
                max3 = max2;
                max2 = num;
            } else if (max3 == null || num > max3) {
                max3 = num;
            }
        }

        return max3 != null ? max3 : max1;
    }

    public static void main(String[] args) {
        Solution414 solution = new Solution414();

        int[] nums1 = { 3, 2, 1 };
        System.out.println("Third maximum in [3, 2, 1]: " + solution.thirdMax(nums1));

        int[] nums2 = { 1, 2 };
        System.out.println("Third maximum in [1, 2]: " + solution.thirdMax(nums2));

        int[] nums3 = { 2, 2, 3, 1 };
        System.out.println("Third maximum in [2, 2, 3, 1]: " + solution.thirdMax(nums3));

        int[] nums4 = { 1, 1, 1 };
        System.out.println("Third maximum in [1, 1, 1]: " + solution.thirdMax(nums4));

        int[] nums5 = { 5, 4, 3, 2, 1 };
        System.out.println("Third maximum in [5, 4, 3, 2, 1]: " + solution.thirdMax(nums5));
    }
}
