public class Solution541 {
    public String reverseStr(String s, int k) {
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i += 2 * k) {
            int left = i;
            int right = Math.min(i + k - 1, chars.length - 1);
            while (left < right) {
                char temp = chars[left];
                chars[left] = chars[right];
                chars[right] = temp;
                left++;
                right--;
            }
        }
        return new String(chars);
    }

    public static void main(String[] args) {
        Solution541 solution = new Solution541();

        String s1 = "abcdefg";
        int k1 = 2;
        System.out.println("The reversed string of '" + s1 + "' with k = " + k1 + " is: " +
                solution.reverseStr(s1, k1));

        String s2 = "abcd";
        int k2 = 2;
        System.out.println("The reversed string of '" + s2 + "' with k = " + k2 + " is: " +
                solution.reverseStr(s2, k2));
    }
}
