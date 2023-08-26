package classContent.wk5.sameTree;

import java.util.ArrayList;
import java.util.List;

public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

    public void printTree() {
        TreeNode root = this;
        final int m = maxHeight(root);
        final int n = (int) Math.pow(2, m) - 1;
        List<List<String>> ans = new ArrayList<>();
        List<String> row = new ArrayList<>();

        for (int i = 0; i < n; ++i)
            row.add("");

        for (int i = 0; i < m; ++i)
            ans.add(new ArrayList<>(row));

        dfs(root, 0, 0, n - 1, ans);
        StringBuilder sb = new StringBuilder();
        for (List<String> r : ans
        ) {
            for (String e : r
            ) {
                if (e.isEmpty())
                    sb.append(" ");
                else
                    sb.append(e);
            }
            sb.append("\n");
        }
        System.out.println(sb.toString());
    }

    /**
     * get the tree's number of height
     * @param root
     * @return
     */
    private int maxHeight(TreeNode root) {
        if (root == null)
            return 0;
        return 1 + Math.max(maxHeight(root.left), maxHeight(root.right));
    }

    /**
     * Depth First Search
     * @param root
     * @param row
     * @param left
     * @param right
     * @param ans
     */
    private void dfs(TreeNode root, int row, int left, int right, List<List<String>> ans) {
        if (root == null)
            return;

        final int mid = (left + right) / 2;
        ans.get(row).set(mid, Integer.toString(root.val));
        dfs(root.left, row + 1, left, mid - 1, ans);
        dfs(root.right, row + 1, mid + 1, right, ans);
    }
}
