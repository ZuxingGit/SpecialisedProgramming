package classContent.wk9;

import java.util.ArrayList;

public class RemoveDuplicateLetters {
    public static void main(String[] args) {
        String s1 = "bcabc";
        String s2 = "cbacdcbc";
        String s3 = "mitnlruhznjfyzmtmfnstsxwktxlboxutbic";
        String s4 = "rusrbofeggbbkyuyjsrzornpdguwzizqszpbicdquakqws";
        System.out.println(letters(s1));
        System.out.println(letters(s2));
        System.out.println(letters(s3));
        System.out.println(letters(s4));
    }

    public static String letters(String s) {
        int length = s.length();
        char[] chars = s.toCharArray();
        int[] lastIndex = new int[26];
        for (int i = 0; i < length; i++) {
            lastIndex[chars[i] - 'a'] = i;
        }

        return letters(chars, "", 0, length, lastIndex);
    }

    public static String letters(char[] chars, String res, int i, int length, int[] lastIndex) {
        if (i < length) {
            char c = chars[i];
            if (!(res.indexOf(c) > -1)) {   //not added
                while (!res.isEmpty() && res.charAt(res.length() - 1) > c && lastIndex[res.charAt(res.length() - 1) - 'a'] > i) {
                    //keep comparing until it's empty or previous char must be kept
                    res = res.replace(Character.toString(res.charAt(res.length() - 1)), "");
                }
                res += c;
                return letters(chars, res, i + 1, length, lastIndex);
            } else {    //added then just skip this one
                return letters(chars, res, i + 1, length, lastIndex);
            }
        } else 
            return res;
    }
}
