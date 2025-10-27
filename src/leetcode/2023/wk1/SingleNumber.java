package leetcode.wk1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SingleNumber {
    public static void main(String[] args) {
        int[] n1 = {2, 2, 1};
        int[] n2 = {4, 1, 2, 1, 2};
        int[] n3 = {1};
        int[] n4 = {463, 191, -915, -438, 420, -135, -431, 611, 695, -605, 469, 917, 301, 70, 209, -66, 956, 7, 245, 147, 104, 633, -218, -879, -894, 208, -37, -344, -252, -684, 728, -943, 858, -557, 217, -655, -91, -308, 699, -152, -702, 916, -867, 447, 29, -207, 56, -149, 909, 980, 508, -747, -389, -718, 814, -790, 803, 299, 443, 932, -814, 495, 274, 88, -22, 373, -324, 144, -144, 421, -499, -178, -582, -124, 741, 526, 215, -538, -912, 400, 425, -693, -767, 862, -746, 462, 762, 148, 463, 191, -915, -438, 420, -135, -431, 611, 695, -605, 469, 917, 301, 70, 209, -66, 956, 7, 245, 147, 104, 633, -218, -879, -894, 208, -37, -344, -252, -684, 728, -943, 858, -557, 217, -655, -91, -308, 699, -152, -702, 916, -867, 447, 29, -207, 56, -149, 909, 980, 508, -747, -389, -718, 814, -790, 803, 299, 443, 932, -814, 495, 274, 88, -22, 373, -324, 144, -144, 421, -499, -178, -582, -124, 741, 526, 215, -538, -912, 400, 425, -693, -767, 862, -746, 462, 762, 148, -3
        };
        System.out.println(singleNumber(n1));
        System.out.println(singleNumber(n2));
        System.out.println(singleNumber(n3));
        System.out.println(singleNumber(n4));
    }

    /**
     * find the single number
     *
     * @param nums
     * @return the single
     */
    public static int singleNumber(int[] nums) {
        if (nums.length == 1)
            return nums[0];

        int size = nums.length;
        int num =nums[0];
        for (int i = 1; i < size; i++) {
            num = num^nums[i];  //fucking insane, but efficient
        }
        return num;
    }
}
