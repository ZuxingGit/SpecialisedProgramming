#include <climits>
#include <algorithm>
using namespace std;

struct TreeNode {
    int val;
    TreeNode *left;
    TreeNode *right;
    TreeNode() : val(0), left(nullptr), right(nullptr) {}
    TreeNode(int x) : val(x), left(nullptr), right(nullptr) {}
    TreeNode(int x, TreeNode *left, TreeNode *right) : val(x), left(left), right(right) {}
};

class Solution783 {
public:
    int minDiffInBST(TreeNode* root) {
        int min_diff = INT_MAX;
        TreeNode* prev = nullptr;
        dfs(root, prev, min_diff);
        return min_diff;
    }

private:
    void dfs(TreeNode* node, TreeNode*& prev, int& min_diff) {
        if (!node) return;
        dfs(node->left, prev, min_diff);
        if (prev) {
            min_diff = min(min_diff, node->val - prev->val);
        }
        prev = node;
        dfs(node->right, prev, min_diff);
    }
};

int main() {
    Solution783 solution;
    TreeNode* root = new TreeNode(4);
    root->left = new TreeNode(2);
    root->right = new TreeNode(6);
    root->left->left = new TreeNode(1);
    root->left->right = new TreeNode(3);
    
    int result = solution.minDiffInBST(root);
    printf("Minimum difference in BST: %d\n", result); // Output: 1

    // Clean up memory
    delete root->left->left;
    delete root->left->right;
    delete root->left;
    delete root->right;
    delete root;

    return 0;
}