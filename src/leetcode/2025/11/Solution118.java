import java.util.List;

public class Solution118 {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new java.util.ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            triangle.add(new java.util.ArrayList<>());
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    triangle.get(i).add(1);
                } else {
                    int val = triangle.get(i - 1).get(j - 1) + triangle.get(i - 1).get(j);
                    triangle.get(i).add(val);
                }
            }
        }
        return triangle;
    }

    public static void main(String[] args) {
        Solution118 solution = new Solution118();

        // Example 1
        int numRows1 = 5;
        List<List<Integer>> result1 = solution.generate(numRows1);
        System.out.println("Example 1: " + result1);
        // Expected: [[1], [1, 1], [1, 2, 1], [1, 3, 3, 1], [1, 4, 6, 4, 1]]

        // Example 2
        int numRows2 = 1;
        List<List<Integer>> result2 = solution.generate(numRows2);
        System.out.println("Example 2: " + result2);
        // Expected: [[1]]
    }
}
