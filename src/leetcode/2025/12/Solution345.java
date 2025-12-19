public class Solution345 {
    public String reverseVowels(String s) {
        char[] chars = s.toCharArray();
        int left = 0;
        int right = chars.length - 1;
        String vowels = "aeiouAEIOU";

        while (left < right) {
            while (left < right && !vowels.contains(String.valueOf(chars[left]))) {
                left++;
            }
            while (left < right && !vowels.contains(String.valueOf(chars[right]))) {
                right--;
            }
            if (left < right) {
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
        Solution345 solution = new Solution345();
        System.out.println(solution.reverseVowels("IceCreAm")); // "AceCreIm"

        System.out.println(solution.reverseVowels("leetcode")); // "leotcede"
    }
}
