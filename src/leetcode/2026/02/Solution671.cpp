#include <climits>
#include <iostream>
using namespace std;

struct TreeNode {
    int val;
    TreeNode* left;
    TreeNode* right;
    TreeNode(int x) : val(x), left(nullptr), right(nullptr) {}
};

class Solution671 {
public:
    int findSecondMinimumValue(TreeNode* root) {
        if (!root) {
            return -1;
        }

        int min = root->val;
        long secondMin = LONG_MAX;
        secondMin = dfs(root, min, secondMin);
        return secondMin == LONG_MAX ? -1 : (int)secondMin;
    }

private:
    long dfs(TreeNode* node, int min, long secondMin) {
        if (!node) {
            return secondMin;
        }
        if (node->val > min && node->val < secondMin) {
            secondMin = node->val;
        }
        secondMin = dfs(node->left, min, secondMin);
        secondMin = dfs(node->right, min, secondMin);
        return secondMin;
    }
};

int main() {
    Solution671 solution;

    TreeNode* root = new TreeNode(2);
    root->left = new TreeNode(2);
    root->right = new TreeNode(5);
    root->right->left = new TreeNode(5);
    root->right->right = new TreeNode(7);

    int result = solution.findSecondMinimumValue(root);
    // Output: 5
    cout << result << endl;

    TreeNode* root2 = new TreeNode(2);
    root2->left = new TreeNode(2);
    root2->right = new TreeNode(2);

    result = solution.findSecondMinimumValue(root2);
    // Output: -1
    cout << result << endl;

    return 0;
}