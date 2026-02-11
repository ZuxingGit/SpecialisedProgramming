public class Solution605 {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int count = 0;
        for (int i = 0; i < flowerbed.length; i++) {
            if (flowerbed[i] == 0) {
                boolean emptyLeft = (i == 0) || (flowerbed[i - 1] == 0);
                boolean emptyRight = (i == flowerbed.length - 1) || (flowerbed[i + 1] == 0);
                if (emptyLeft && emptyRight) {
                    flowerbed[i] = 1; // Plant a flower here
                    count++;
                }
            }
        }
        return count >= n;
    }

    public static void main(String[] args) {
        Solution605 solution = new Solution605();

        int[] flowerbed1 = { 1, 0, 0, 0, 1 };
        int n1 = 1;
        System.out.println(solution.canPlaceFlowers(flowerbed1, n1)); // Should print true

        int[] flowerbed2 = { 1, 0, 0, 0, 1 };
        int n2 = 2;
        System.out.println(solution.canPlaceFlowers(flowerbed2, n2)); // Should print false
    }
}
