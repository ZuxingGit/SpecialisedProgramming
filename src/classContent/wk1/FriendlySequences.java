package classContent.wk1;

import java.util.Arrays;

public class FriendlySequences {
    public static void main(String[] args) {
        int[] a0 = {112, 12, 21, 354, 534345, 345, 2221};
        int[] a1 = {10, 1100, 10101, 111, 1111, 11111, 11, 1, 111};
        int[] a2 = {0, 0, 0, 0};
        int[] a3 = {123456890, 213456890, 198654320};
        int[] a4 = {9};
        System.out.println(count(a0));
        System.out.println(count(a1));
        System.out.println(count(a2));
        System.out.println(count(a3));
        System.out.println(count(a4));
    }


    /**
     * @param array
     * @return the number of friendly sequences
     */
    public static int count(int[] array) {
        int count = 0;
        int size = array.length;
        for (int i = 0; i < size - 1; i++) {
            for (int j = i + 1; j < size; j++) {
                if (isFriend(array[i], array[j])) {
                    count++;
                } else {
                    break;
                }
            }
        }
        System.out.println(Arrays.toString(array));
        return count;
    }

    /**
     * @param a
     * @param b
     * @return whether they are friendly numbers
     */
    public static boolean isFriend(int a, int b) {
        String s1 = String.valueOf(a);
        String s2 = String.valueOf(b);
        for (char c : s1.toCharArray()
        ) {
            if (s2.contains(String.valueOf(c)))
                continue;
            else
                return false;
        }
        for (char c : s2.toCharArray()
        ) {
            if (s1.contains(String.valueOf(c)))
                continue;
            else
                return false;
        }
        return true;
    }
    
}
