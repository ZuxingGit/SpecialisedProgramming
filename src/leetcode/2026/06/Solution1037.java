public class Solution1037 {
    public boolean isBoomerang(int[][] points) {
        int x1 = points[0][0], y1 = points[0][1];
        int x2 = points[1][0], y2 = points[1][1];
        int x3 = points[2][0], y3 = points[2][1];

        return (x1 - x2) * (y2 - y3) != (y1 - y2) * (x2 - x3);
    }

    public static void main(String[] args) {
        Solution1037 solution = new Solution1037();

        int[][] points1 = { { 1, 1 }, { 2, 3 }, { 3, 2 } };
        System.out.println(solution.isBoomerang(points1)); // Output: true

        int[][] points2 = { { 1, 1 }, { 2, 2 }, { 3, 3 } };
        System.out.println(solution.isBoomerang(points2)); // Output: false
    }
}
