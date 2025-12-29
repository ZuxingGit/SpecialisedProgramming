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

class Solution404 {
public:
    int sumOfLeftLeaves(TreeNode* root) {
        if (!root) return 0;
        int sum = 0;
        if (root->left) {
            if (!root->left->left && !root->left->right) {
                sum += root->left->val;
            } else {
                sum += sumOfLeftLeaves(root->left);
            }
        }
        sum += sumOfLeftLeaves(root->right);
        return sum;
    }
};

int main() {
    Solution404 solution;

    // Example 1
    TreeNode* root1 = new TreeNode(3);
    root1->left = new TreeNode(9);
    root1->right = new TreeNode(20);
    root1->right->left = new TreeNode(15);
    root1->right->right = new TreeNode(7);
    cout << "Sum of left leaves (Example 1): " << solution.sumOfLeftLeaves(root1) << endl;

    // Example 2
    TreeNode* root2 = new TreeNode(1);
    cout << "Sum of left leaves (Example 2): " << solution.sumOfLeftLeaves(root2) << endl;

    // Clean up memory (not shown for brevity)

    return 0;
}