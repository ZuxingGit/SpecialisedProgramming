#include <iostream>
using namespace std;

struct TreeNode
{
    int val;
    TreeNode *left;
    TreeNode *right;
    TreeNode() : val(0), left(nullptr), right(nullptr) {}
    TreeNode(int x) : val(x), left(nullptr), right(nullptr) {}
    TreeNode(int x, TreeNode *left, TreeNode *right) : val(x), left(left), right(right) {}
};

class Solution
{
public:
    bool hasPathSum(TreeNode *root, int targetSum)
    {
        return dfs(root, targetSum);
    }

private:
    bool dfs(TreeNode *node, int remainingSum)
    {
        if (node == nullptr)
        {
            return false;
        }
        remainingSum -= node->val;
        if (node->left == nullptr && node->right == nullptr)
        {
            return remainingSum == 0;
        }
        return dfs(node->left, remainingSum) || dfs(node->right, remainingSum);
    }
};

int main()
{
    Solution solution;
    TreeNode *root = new TreeNode(5,
                                  new TreeNode(4,
                                               new TreeNode(11,
                                                            new TreeNode(7),
                                                            new TreeNode(2)),
                                               nullptr),
                                  new TreeNode(8,
                                               new TreeNode(13),
                                               new TreeNode(4,
                                                            nullptr,
                                                            new TreeNode(1))));
    int targetSum = 22;
    bool result = solution.hasPathSum(root, targetSum);
    cout << result << endl; // Expected output: true

    // Example 2
    TreeNode *root2 = new TreeNode(1,
                                   new TreeNode(2),
                                   new TreeNode(3));
    targetSum = 5;
    result = solution.hasPathSum(root2, targetSum);
    cout << result << endl; // Expected output: false

    // Example 3
    TreeNode *root3 = nullptr;
    targetSum = 0;
    result = solution.hasPathSum(root3, targetSum);
    cout << result << endl; // Expected output: false

    return 0;
}