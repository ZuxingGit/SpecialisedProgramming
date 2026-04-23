public class Solution836 {
    public boolean isRectangleOverlap(int[] rec1, int[] rec2) {
        return !(rec1[2] <= rec2[0] || // rec1 is to the left of rec2
                rec1[0] >= rec2[2] || // rec1 is to the right of rec2
                rec1[3] <= rec2[1] || // rec1 is below rec2
                rec1[1] >= rec2[3]); // rec1 is above rec2
    }

    public static void main(String[] args) {
        Solution836 solution = new Solution836();

        int[] rec1 = { 0, 0, 2, 2 };
        int[] rec2 = { 1, 1, 3, 3 };
        System.out.println(solution.isRectangleOverlap(rec1, rec2)); // Output: true

        int[] rec3 = { 0, 0, 1, 1 };
        int[] rec4 = { 1, 0, 2, 1 };
        System.out.println(solution.isRectangleOverlap(rec3, rec4)); // Output: false

        int[] rec5 = { 0, 0, 1, 1 };
        int[] rec6 = { 2, 2, 3, 3 };
        System.out.println(solution.isRectangleOverlap(rec5, rec6)); // Output: false
    }
}
