public class Solution917 {
    public String reverseOnlyLetters(String s) {
        char[] chars = s.toCharArray();
        int left = 0, right = chars.length - 1;

        while (left < right) {
            while (left < right && !Character.isLetter(chars[left])) {
                left++;
            }
            while (left < right && !Character.isLetter(chars[right])) {
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
        Solution917 solution = new Solution917();

        String s1 = "ab-cd";
        String result1 = solution.reverseOnlyLetters(s1);
        System.out.println(result1); // Output: "dc-ba"

        String s2 = "a-bC-dEf-ghIj";
        String result2 = solution.reverseOnlyLetters(s2);
        System.out.println(result2); // Output: "j-Ih-gfE-dCba"

        String s3 = "Test1ng-Leet=code-Q!";
        String result3 = solution.reverseOnlyLetters(s3);
        System.out.println(result3); // Output: "Qedo1ct-eeLg=ntse-T!"
    }
}
