#include <vector>
#include <string>
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

class Solution257
{
public:
    vector<string> binaryTreePaths(TreeNode *root)
    {
        vector<string> result;
        if (root == nullptr)
        {
            return result;
        }
        string path;
        dfs(root, path, result);
        return result;
    }

private:
    void dfs(TreeNode *node, string path, vector<string> &result)
    {
        path += to_string(node->val);
        if (node->left == nullptr && node->right == nullptr)
        {
            result.push_back(path);
            return;
        }
        path += "->";
        if (node->left != nullptr)
        {
            dfs(node->left, path, result);
        }
        if (node->right != nullptr)
        {
            dfs(node->right, path, result);
        }
    }
};

int main()
{
    Solution257 sol;

    TreeNode *root = new TreeNode(1);
    root->left = new TreeNode(2);
    root->right = new TreeNode(3);
    root->left->right = new TreeNode(5);

    vector<string> paths = sol.binaryTreePaths(root);
    for (const string &path : paths)
    {
        cout << path << endl;
    }

    return 0;
}