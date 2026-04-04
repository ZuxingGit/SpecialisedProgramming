public class Solution744 {
    public char nextGreatestLetter(char[] letters, char target) {
        int left = 0, right = letters.length;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (letters[mid] <= target) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return letters[left % letters.length];
    }

    public static void main(String[] args) {
        Solution744 solution = new Solution744();

        char[] letters = { 'c', 'f', 'j' };
        char target = 'a';
        char output = solution.nextGreatestLetter(letters, target);
        System.out.println("Output: " + output);

        letters = new char[] { 'c', 'f', 'j' };
        target = 'c';
        output = solution.nextGreatestLetter(letters, target);
        System.out.println("Output: " + output);

        letters = new char[] { 'x', 'x', 'y', 'y' };
        target = 'z';
        output = solution.nextGreatestLetter(letters, target);
        System.out.println("Output: " + output);
    }
}
