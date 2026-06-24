public class Solution1071 {
    public String gcdOfStrings(String str1, String str2) {
        if (!(str1 + str2).equals(str2 + str1)) {
            return "";
        }
        int gcdLength = gcd(str1.length(), str2.length());
        return str1.substring(0, gcdLength);
    }

    private int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static void main(String[] args) {
        Solution1071 solution = new Solution1071();

        String str1_1 = "ABCABC";
        String str2_1 = "ABC";
        String result1 = solution.gcdOfStrings(str1_1, str2_1);
        System.out.println(result1); // Output: "ABC"

        String str1_2 = "ABABAB";
        String str2_2 = "ABAB";
        String result2 = solution.gcdOfStrings(str1_2, str2_2);
        System.out.println(result2); // Output: "AB"

        String str1_3 = "LEET";
        String str2_3 = "CODE";
        String result3 = solution.gcdOfStrings(str1_3, str2_3);
        System.out.println(result3); // Output: ""

        String str1_4 = "AAAAAB";
        String str2_4 = "AAA";
        String result4 = solution.gcdOfStrings(str1_4, str2_4);
        System.out.println(result4); // Output: ""
    }
}
