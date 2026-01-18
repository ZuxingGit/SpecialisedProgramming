import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class TreeNode {
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
}

public class Solution501 {
    public int[] findMode(TreeNode root) {
        Map<Integer, Integer> countMap = new HashMap<>();
        traverseAndCount(root, countMap);

        int maxCount = 0;
        for (int count : countMap.values()) {
            if (count > maxCount) {
                maxCount = count;
            }
        }

        List<Integer> modes = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
            if (entry.getValue() == maxCount) {
                modes.add(entry.getKey());
            }
        }

        int[] result = new int[modes.size()];
        for (int i = 0; i < modes.size(); i++) {
            result[i] = modes.get(i);
        }

        return result;
    }

    private void traverseAndCount(TreeNode node, Map<Integer, Integer> countMap) {
        if (node == null) {
            return;
        }

        countMap.put(node.val, countMap.getOrDefault(node.val, 0) + 1);
        traverseAndCount(node.left, countMap);
        traverseAndCount(node.right, countMap);
    }

    public static void main(String[] args) {
        Solution501 solution = new Solution501();

        TreeNode root1 = new TreeNode(1);
        root1.right = new TreeNode(2);
        root1.right.left = new TreeNode(2);
        int[] result1 = solution.findMode(root1);
        System.out.print("Modes of the BST: ");
        for (int num : result1) {
            System.out.print(num + " ");
        }
        System.out.println();

        TreeNode root2 = new TreeNode(0);
        int[] result2 = solution.findMode(root2);
        System.out.print("Modes of the BST: ");
        for (int num : result2) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
