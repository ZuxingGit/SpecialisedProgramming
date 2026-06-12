public class Solution1025 {
    public boolean divisorGame(int n) {
        return n % 2 == 0;
    }

    public static void main(String[] args) {
        Solution1025 solution = new Solution1025();
        System.out.println(solution.divisorGame(2)); // Output: true
        System.out.println(solution.divisorGame(3)); // Output: false
        System.out.println(solution.divisorGame(4)); // Output: true
    }
}
