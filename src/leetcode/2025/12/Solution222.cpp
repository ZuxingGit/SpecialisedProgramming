#include <cstdio>

struct TreeNode
{
    int val;
    TreeNode *left;
    TreeNode *right;
    TreeNode() : val(0), left(nullptr), right(nullptr) {}
    TreeNode(int x) : val(x), left(nullptr), right(nullptr) {}
    TreeNode(int x, TreeNode *left, TreeNode *right) : val(x), left(left), right(right) {}
};

class Solution222
{
public:
    int countNodes(TreeNode *root)
    {
        if (root == nullptr)
        {
            return 0;
        }
        return 1 + countNodes(root->left) + countNodes(root->right);
    }
};

int main()
{
    Solution222 solution;

    // Creating a binary tree:
    //       1
    //      / \
    //     2   3
    //    / \   \
    //   4   5   6
    TreeNode *root = new TreeNode(1);
    root->left = new TreeNode(2);
    root->right = new TreeNode(3);
    root->left->left = new TreeNode(4);
    root->left->right = new TreeNode(5);
    root->right->right = new TreeNode(6);

    int nodeCount = solution.countNodes(root);
    printf("Number of nodes in the binary tree: %d\n", nodeCount);
    // Expected output: 6

    // Clean up memory (not shown here for brevity)

    return 0;
}