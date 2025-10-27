package leetcode.wk12;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] strs1 = {"flower", "flow", "flight"};
        String[] strs2 = {"dog", "racecar", "car"};
        String[] strs3 = {"ab", "a"};
        System.out.println(longestCommonPrefix(strs1));
        System.out.println(longestCommonPrefix(strs2));
        System.out.println(longestCommonPrefix(strs3));
    }

    public static String longestCommonPrefix(String[] strs) {
        String common = "";
        if (strs.length == 0)
            return common;

        String str1 = strs[0];
        for (int j = 0; j < str1.length(); j++) {
            int index = common.length();
            char ch = str1.charAt(index);
            for (int i = 0; i < strs.length; i++) {
                if (strs[i].length() == index || strs[i].charAt(index) != ch) {
                    return common;
                }
            }
            common += ch;
        }

        return common;
    }
}
