package leetcode.wk2;

import java.util.Arrays;

public class ReverseString {
    public static void main(String[] args) {
        char[] s1= new char[]{'h', 'e', 'l', 'l', 'o'};
        char[] s2= new char[]{'s','t','r','i','n','g'};
        reverseString(s1);
        reverseString(s2);
    }

    public static void reverseString(char[] s) {
        for (int i = 0, j = s.length - 1; i < s.length / 2; i++, j--) {

            char temp = s[i];
            s[i] = s[j];
            s[j] = temp;
        }
        System.out.println(Arrays.toString(s));
    }
}
