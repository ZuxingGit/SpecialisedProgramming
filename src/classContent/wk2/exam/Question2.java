package classContent.wk2.exam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Question2 {
    public static void main(String[] args) {
        System.out.println(maxWaterContainer(new int[]{2, 3, 10, 5, 6, 8, 7}));
        System.out.println(maxWaterContainer(new int[]{1, 2}));
        System.out.println(maxWaterContainer(new int[]{1, 1}));
        System.out.println(maxWaterContainer(new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7}));
        System.out.println(maxWaterContainer(new int[]{1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1,
                1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}));
    }

    public static int maxWaterContainer(int[] height) {
        int size = height.length;
        if (size < 2 || size > 100000) {
            //The number of elements in height (n) is between 2 and 10^5, inclusive.
            System.out.println("Wrong array size!");
            return 0;
        }
        //Each element of height is between 0 and 10^4, inclusive.
        if (Arrays.stream(height).max().getAsInt() > 10000 || Arrays.stream(height).min().getAsInt() < 0) {
            System.out.println("element out of range!");
            return 0;
        }
        int maxArea = 0;
        int curentArea = 0;
        int left = 0;
        int right = size - 1;
        while (left < right) {
            curentArea = Math.min(height[left], height[right]) * (right - left);
            maxArea = Math.max(maxArea, curentArea);
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }
        
        return maxArea;
    }
}
