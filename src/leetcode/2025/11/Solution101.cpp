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
    bool isSymmetric(TreeNode *root)
    {
        if (root == nullptr)
        {
            return true;
        }
        return isMirror(root->left, root->right);
    }

private:
    bool isMirror(TreeNode *t1, TreeNode *t2)
    {
        if (t1 == nullptr && t2 == nullptr)
        {
            return true;
        }
        if (t1 == nullptr || t2 == nullptr)
        {
            return false;
        }
        if (t1->val != t2->val)
        {
            return false;
        }
        return isMirror(t1->left, t2->right) && isMirror(t1->right, t2->left);
    }
};

int main()
{
    Solution solution;
    // Test case: Constructing the symmetric binary tree
    //       1
    //      / \
    //     2   2
    //    / \ / \
    //   3  4 4  3
    TreeNode *root = new TreeNode(1);
    root->left = new TreeNode(2);
    root->right = new TreeNode(2);
    root->left->left = new TreeNode(3);
    root->left->right = new TreeNode(4);
    root->right->left = new TreeNode(4);
    root->right->right = new TreeNode(3);

    bool result = solution.isSymmetric(root);
    // Expected Output: true
    if (result)
    {
        cout << "The tree is symmetric." << endl;
    }
    else
    {
        cout << "The tree is not symmetric." << endl;
    }

    TreeNode *root2 = new TreeNode(1);
    root2->left = new TreeNode(2);
    root2->right = new TreeNode(2);
    root2->left->right = new TreeNode(3);
    root2->right->right = new TreeNode(3);

    bool result2 = solution.isSymmetric(root2);
    // Expected Output: false
    if (result2)
    {
        cout << "The tree is symmetric." << endl;
    }
    else
    {
        cout << "The tree is not symmetric." << endl;
    }

    return 0;
}
