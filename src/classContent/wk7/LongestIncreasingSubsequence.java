package classContent.wk7;

public class LongestIncreasingSubsequence {
    public static void main(String[] args) {
        int[] a1 = {10, 9, 2, 5, 3, 7, 101, 18};
        int[] a2 = {0, 1, 0, 3, 2, 3};
        int[] a3 = {7, 7, 7, 7, 7, 7, 7};
        int[] a4 = {4, 10, 4, 3, 8, 9};
        int[] a5 = {10, 9, 2, 5, 3, 4};
        int[] a6 = {5, 7, -24, 12, 13, 2, 3, 12, 5, 6, 35};
        System.out.println(lengthOfLIS(a1));
        System.out.println(lengthOfLIS(a2));
        System.out.println(lengthOfLIS(a3));
        System.out.println(lengthOfLIS(a4));
        System.out.println(lengthOfLIS(a5));
        System.out.println(lengthOfLIS(a6));
    }

    public static int lengthOfLIS(int[] nums) {
        int[] tails = new int[nums.length];
        int size = 0;
        for (int num : nums) {
            int i = 0, j = size;
            while (i != j) {
                int m = (i + j) / 2;
                if (tails[m] < num)
                    i = m + 1;  //index + 1, move right
                else
                    j = m;  //index takes the middle value, move left
            }
            tails[i] = num;
            if (i == size) ++size;
        }
        return size;
    }
}
