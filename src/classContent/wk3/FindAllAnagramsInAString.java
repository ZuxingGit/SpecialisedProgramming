package classContent.wk3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindAllAnagramsInAString {
    public static void main(String[] args) {
        String s1 = "cbaebabacd", p1 = "abc";
        String s2 = "abab", p2 = "ab";
        String s3 = "cbaebabdacd", p3 = "abdc";
        System.out.println(findAnagrams(s1, p1));
        System.out.println(findAnagrams(s2, p2));
        System.out.println(findAnagrams(s3, p3));
    }

    public static List<Integer> findAnagrams(String s, String p) {
        List<Integer> list = new ArrayList<Integer>();
        char[] charP = p.toCharArray();
        Arrays.sort(charP);

        if (s.length() < p.length()) {
            return list;
        } else {
            int sSize = s.length();
            int pSize = p.length();
            for (int i = 0; i <= sSize - pSize; i++) {
                String subStr = s.substring(i, i + pSize);
                char[] charSub = subStr.toCharArray();
                Arrays.sort(charSub);
                if (Arrays.equals(charP, charSub))
                    list.add(i);
            }
        }
        return list;
    }
}
