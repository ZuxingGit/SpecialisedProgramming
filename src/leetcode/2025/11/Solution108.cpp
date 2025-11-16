#include <iostream>
#include <vector>
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
    TreeNode *sortedArrayToBST(vector<int> &nums)
    {
        return buildBST(nums, 0, nums.size() - 1);
    }

private:
    TreeNode *buildBST(const vector<int> &nums, int left, int right)
    {
        if (left > right)
        {
            return nullptr;
        }
        int mid = left + (right - left) / 2;
        TreeNode *node = new TreeNode(nums[mid]);
        node->left = buildBST(nums, left, mid - 1);
        node->right = buildBST(nums, mid + 1, right);
        return node;
    }
};

int main()
{
    Solution solution;
    vector<int> nums = {-10, -3, 0, 5, 9};
    TreeNode *root = solution.sortedArrayToBST(nums);
    // print the resulting BST in-order to verify
    function<void(TreeNode *)> inOrder = [&](TreeNode *node)
    {
        if (node == nullptr)
            return;
        inOrder(node->left);
        cout << node->val << " ";
        inOrder(node->right);
    };
    inOrder(root);
    cout << endl;

    return 0;
}
