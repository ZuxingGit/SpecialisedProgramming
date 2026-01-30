#include <iostream>
using namespace std;

// Definition for a binary tree node.
struct TreeNode {
    int val;
    TreeNode *left;
    TreeNode *right;
    TreeNode() : val(0), left(nullptr), right(nullptr) {}
    TreeNode(int x) : val(x), left(nullptr), right(nullptr) {}
    TreeNode(int x, TreeNode *left, TreeNode *right) : val(x), left(left), right(right) {}
};

class Solution563 {
public:
    int findTilt(TreeNode* root) {
        int totalTilt = 0;
        computeSumAndTilt(root, totalTilt);
        return totalTilt;
    }

private:
    int computeSumAndTilt(TreeNode* node, int& totalTilt) {
        if (!node) {
            return 0;
        }

        int leftSum = computeSumAndTilt(node->left, totalTilt);
        int rightSum = computeSumAndTilt(node->right, totalTilt);
        totalTilt += abs(leftSum - rightSum);
        return leftSum + rightSum + node->val;
    }
};

int main() {
    Solution563 solution;

    // case1
    TreeNode* root1 = new TreeNode(1, new TreeNode(2), new TreeNode(3));
    int result1 = solution.findTilt(root1);
    // Expected output: 1
    cout << "Case 1 Result: " << result1 << endl;

    // case2
    TreeNode* root2 = new TreeNode(4, new TreeNode(2, new TreeNode(3), new TreeNode(5)), new TreeNode(9, nullptr, new TreeNode(7)));
    int result2 = solution.findTilt(root2);
    // Expected output: 15
    cout << "Case 2 Result: " << result2 << endl;

    return 0;
}