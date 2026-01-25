#include <iostream>
using namespace std;

struct TreeNode {
    int val;
    TreeNode *left;
    TreeNode *right;
    TreeNode() : val(0), left(nullptr), right(nullptr) {}
    TreeNode(int x) : val(x), left(nullptr), right(nullptr) {}
    TreeNode(int x, TreeNode *left, TreeNode *right) : val(x), left(left), right(right) {}
};

class Solution530 {
public:
    int getMinimumDifference(TreeNode* root) {
        int minDiff = INT_MAX;
        TreeNode* prev = nullptr;
        inorderTraversal(root, prev, minDiff);
        return minDiff;
    }

private:
    void inorderTraversal(TreeNode* node, TreeNode*& prev, int& minDiff) {
        if (!node) return;

        inorderTraversal(node->left, prev, minDiff);

        if (prev) {
            minDiff = min(minDiff, node->val - prev->val);
        }
        prev = node;

        inorderTraversal(node->right, prev, minDiff);
    }
};

int main() {
    Solution530 solution;

    // Example usage:
    TreeNode* root = new TreeNode(4);
    root->left = new TreeNode(2);
    root->right = new TreeNode(6);
    root->left->left = new TreeNode(1);
    root->left->right = new TreeNode(3);

    cout << solution.getMinimumDifference(root) << endl; // Expected output: 1

    // Clean up memory (not shown here for brevity)
    delete root->left->left;
    delete root->left->right;
    delete root->left;
    delete root->right;
    delete root;

    return 0;
}