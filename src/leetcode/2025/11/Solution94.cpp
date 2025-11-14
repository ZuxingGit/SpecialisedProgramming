#include <vector>
#include <iostream>
using namespace std;

// Definition for a binary tree node.
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
    vector<int> inorderTraversal(TreeNode *root)
    {
        vector<int> result;
        inorderHelper(root, result);
        return result;
    }

private:
    void inorderHelper(TreeNode *node, vector<int> &result)
    {
        if (node == nullptr)
        {
            return;
        }
        inorderHelper(node->left, result);
        result.push_back(node->val);
        inorderHelper(node->right, result);
    }
};

int main()
{
    Solution solution;
    // Test case: Constructing the binary tree
    //       1
    //        \
    //         2
    //        /
    //       3
    TreeNode *root = new TreeNode(1);
    root->right = new TreeNode(2);
    root->right->left = new TreeNode(3);

    vector<int> result = solution.inorderTraversal(root);
    // Expected Output: 1 3 2
    for (int val : result)
    {
        cout << val << " ";
    }
    cout << endl;

    return 0;
}