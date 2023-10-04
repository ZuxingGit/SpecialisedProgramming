package classContent.wk9;

import classContent.wk5.Tree.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class SerializeAndDeserializeBinaryTree {
    public static void main(String[] args) {
//        1,2,3,null,null,4,5
        TreeNode t1 = new TreeNode(1, new TreeNode(2), new TreeNode(3, new TreeNode(4), new TreeNode(5)));
        TreeNode t2 = null;
        System.out.println(serialize(t1));
//        System.out.println("<" + serialize(t2) + ">");
        System.out.println(deserialize("1,2,3,null,null,4,5"));
    }

    // Encodes a tree to a single string.
    public static String serialize(TreeNode root) {
        final int m = maxHeight(root);
        List<List<String>> ans = new ArrayList<>();
        List<String> row = new ArrayList<>();
//        for (int i = 0; i < n; ++i)
//            row.add("");

        for (int i = 0; i < m; ++i)
            ans.add(new ArrayList<>(row));

        dfs(root, 0, m, ans);
        StringBuilder sb = new StringBuilder();
        for (List<String> r : ans
        ) {
            for (String e : r
            ) {
                if (e.isEmpty())
                    sb.append("null").append(",");
                else
                    sb.append(e).append(",");
            }
        }
        if (sb.lastIndexOf(",") > -1)
            sb.deleteCharAt(sb.lastIndexOf(","));
//        System.out.println(sb.toString());
        return sb.toString();
    }

    // Decodes your encoded data to tree.
    public static TreeNode deserialize(String data) {
        if (data.isEmpty())
            return null;

        String[] elements = data.split(",");
        if (elements.length == 0)
            return null;

        Queue<TreeNode> q = new LinkedList<>();
        TreeNode root = new TreeNode(Integer.valueOf(elements[0]));
        q.add(root);
        for (int i = 1; i < elements.length; i++) {
            TreeNode parent = q.poll();
            if (!elements[i].equals("null")) {
                TreeNode left = new TreeNode(Integer.valueOf(elements[i]));
                parent.left = left;
                q.add(left);
            }
            if (!elements[++i].equals("null")) {
                TreeNode right = new TreeNode(Integer.valueOf(elements[i]));
                parent.right = right;
                q.add(right);
            }
        }
        return root;
    }

    /**
     * Depth First Search
     *
     * @param root
     * @param row
     * @param ans
     */
    private static void dfs(TreeNode root, int row, int m, List<List<String>> ans) {
        if (row < m) {
            if (root == null) {
                ans.get(row).add("null"); //above leaf nodes, empty set to "null"
                return;
            }
        } else
            return; //exceeded the depth range

        ans.get(row).add(Integer.toString(root.val));
        dfs(root.left, row + 1, m, ans);
        dfs(root.right, row + 1, m, ans);
    }

    /**
     * get the tree's number of height
     *
     * @param root
     * @return
     */
    private static int maxHeight(TreeNode root) {
        if (root == null)
            return 0;
        return 1 + Math.max(maxHeight(root.left), maxHeight(root.right));
    }
}
