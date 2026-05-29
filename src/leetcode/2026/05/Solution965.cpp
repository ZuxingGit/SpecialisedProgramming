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

class Solution965 {
public:
    bool isUnivalTree(TreeNode* root) {
        if (!root) return true;
        if (root->left && root->left->val != root->val) return false;
        if (root->right && root->right->val != root->val) return false;
        return isUnivalTree(root->left) && isUnivalTree(root->right);
    }
};

int main() {
    Solution965 solution;

    TreeNode* root1 = new TreeNode(1);
    root1->left = new TreeNode(1);
    root1->right = new TreeNode(1);
    cout << solution.isUnivalTree(root1) << endl;

    TreeNode* root2 = new TreeNode(2);
    root2->left = new TreeNode(2);
    root2->right = new TreeNode(5);
    cout << solution.isUnivalTree(root2) << endl;

    return 0;
}