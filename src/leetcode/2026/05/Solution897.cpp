#include <iostream>
using namespace std;

struct TreeNode {
    int val;
    TreeNode *left;
    TreeNode *right;

    TreeNode() : val(0), left(NULL), right(NULL) {}
    TreeNode(int x) : val(x), left(NULL), right(NULL) {}
    TreeNode(int x, TreeNode *left, TreeNode *right) : val(x), left(left), right(right) {}
};

class Solution897 {
public:
    TreeNode* increasingBST(TreeNode* root) {
        TreeNode* dummy = new TreeNode(0);
        TreeNode* current = dummy;
        inOrder(root, current);
        return dummy->right;
    }

private:
    void inOrder(TreeNode* node, TreeNode*& current) {
        if (!node) return;
        inOrder(node->left, current);
        current->right = new TreeNode(node->val);
        current = current->right;
        inOrder(node->right, current);
    }
};

int main() {
    Solution897 solution;

    TreeNode* root = new TreeNode(5);
    root->left = new TreeNode(3);
    root->right = new TreeNode(6);
    root->left->left = new TreeNode(2);
    root->left->right = new TreeNode(4);
    root->right->right = new TreeNode(8);

    TreeNode* result = solution.increasingBST(root);
    while (result) {
        cout << result->val << " "; // Output: 2 3 4 5 6 8
        result = result->right;
    }
    cout << endl;

    TreeNode* root2 = new TreeNode(5);
    root2->left = new TreeNode(1);
    root2->right = new TreeNode(7);
    TreeNode* result2 = solution.increasingBST(root2);
    while (result2) {
        cout << result2->val << " "; // Output: 1 5 7
        result2 = result2->right;
    }
    cout << endl;

    return 0;
}