import java.util.List;

public class Solution119 {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> row = new java.util.ArrayList<>();
        for (int i = 0; i <= rowIndex; i++) {
            row.add(1);
        }
        // row.set(0, 1);
        for (int i = 1; i < rowIndex; i++) {
            for (int j = i; j > 0; j--) {
                row.set(j, row.get(j) + row.get(j - 1));
            }
        }
        return row;
    }

    public static void main(String[] args) {
        Solution119 solution = new Solution119();

        // Example 1
        int rowIndex1 = 3;
        List<Integer> result1 = solution.getRow(rowIndex1);
        System.out.println("Example 1: " + result1);
        // Expected: [1, 3, 3, 1]

        // Example 2
        int rowIndex2 = 0;
        List<Integer> result2 = solution.getRow(rowIndex2);
        System.out.println("Example 2: " + result2);
        // Expected: [1]

        // Example 3
        int rowIndex3 = 1;
        List<Integer> result3 = solution.getRow(rowIndex3);
        System.out.println("Example 3: " + result3);
        // Expected: [1, 1]
    }
}
