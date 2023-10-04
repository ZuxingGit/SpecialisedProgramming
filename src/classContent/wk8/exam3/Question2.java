package classContent.wk8.exam3;

public class Question2 {
    public static void main(String[] args) {
        int i = 1;
        int[] nums1 = {1, 2, 3};
        int[] mul1 = {3, 2, 1};
        int[] nums2 = {-5, -3, -3, -2, 7, 1};
        int[] mul2 = {-10, -5, 3, 4, 6};
        int[] nums3 = {-688, -977, -729};
        int[] mul3 = {-160, -312, -983};
        int[] nums4 = {985, -682, 839, -81, -206, -905, 668, 577, 999, 929, -763, -852, 631, 118, 990, 1, -251, -354, 57, -491, -725, -786, 514, -968, 142};
        int[] mul4 = {-771, -131, 290, 796, 906, -751, -355, 889, -981, 692, 642, -543, -270, -372, -778};
        int[] n5 = {940, 64, 733, 177, -181, -397, -728, -829, -499, 984};
        int[] m5 = {-623, -699, 666, -295};
        int[] nums5 = {667, 407};
        int[] mul5 = {562};
        int[] nums6 = {651, 610};
        int[] mul6 = {941, 479};
        int[] nums7 = {261};
        int[] mul7 = {-245};
        System.out.println("case " + i++ + ": " + maxScore(nums1, mul1));
        System.out.println("case " + i++ + ": " + maxScore(nums2, mul2));
        System.out.println("case " + i++ + ": " + maxScore(nums3, mul3));
        System.out.println("case " + i++ + ": " + maxScore(nums4, mul4));
        System.out.println("case " + i++ + ": " + maxScore(n5, m5));
        System.out.println("case " + i++ + ": " + maxScore(nums5, mul5));
        System.out.println("case " + i++ + ": " + maxScore(nums6, mul6));
        System.out.println("case " + i++ + ": " + maxScore(nums7, mul7));
    }

    public static int maxScore(int[] nums, int[] mul) {
        int len1 = nums.length;
        int len2 = mul.length;
        int[][] allProducts = new int[len1][len2];
        for (int i = 0; i < len1; i++) {
            for (int j = 0; j < len2; j++) {
                // save all possible products beforehand then just take it to use it
                allProducts[i][j] = nums[i] * mul[j];
            }
        }

        return maxScoreDP(0, len1 - 1, 0, len2 - 1, allProducts);
    }

    /**
     * @param l1  left index of nums
     * @param r1  right index of nums
     * @param l2  left index of mul
     * @param r2  right index of mul
     * @param all prepared products of multiply
     * @return
     */
    public static int maxScoreDP(int l1, int r1, int l2, int r2, int[][] all) {
        if (l1 == r1) {
            return Math.max(all[l1][l2], all[l1][r2]);
        }
        if (l2 == r2) {
            return Math.max(all[l1][l2], all[r1][l2]);
        }
        return Math.max(
                all[l1][l2] + maxScoreDP(l1 + 1, r1, l2 + 1, r2, all),
                all[r1][l2] + maxScoreDP(l1, r1 - 1, l2 + 1, r2, all)
                );

    }
}
