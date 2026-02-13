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

class Solution617 {
public:
    TreeNode* mergeTrees(TreeNode* root1, TreeNode* root2) {
        if (root1 == nullptr) {
            return root2;
        }
        if (root2 == nullptr) {
            return root1;
        }
        TreeNode* merged = new TreeNode(root1->val + root2->val);
        merged->left = mergeTrees(root1->left, root2->left);
        merged->right = mergeTrees(root1->right, root2->right);
        return merged;
    }

    void printTree(TreeNode* node) {
        if (node == nullptr) {
            return;
        }
        cout << node->val << " ";
        printTree(node->left);
        printTree(node->right);
    }
};

int main() {
    Solution617 solution;

    TreeNode* root1 = new TreeNode(1);
    root1->left = new TreeNode(3);
    root1->left->left = new TreeNode(5);
    root1->right = new TreeNode(2);
    TreeNode* root2 = new TreeNode(2);
    root2->left = new TreeNode(1);
    root2->left->right = new TreeNode(4);
    root2->right = new TreeNode(3);
    root2->right->right = new TreeNode(7);

    TreeNode* mergedRoot = solution.mergeTrees(root1, root2);
    solution.printTree(mergedRoot);

    return 0;
}