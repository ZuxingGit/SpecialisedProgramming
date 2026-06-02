#include <queue>
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

class Solution993 {
public:
    bool isCousins(TreeNode* root, int x, int y) {
        if (!root) {
            return false;
        }
        queue<TreeNode*> q;
        q.push(root);
        while (!q.empty()) {
            int size = q.size();
            bool foundX = false;
            bool foundY = false;
            for (int i = 0; i < size; ++i) {
                TreeNode* node = q.front();
                q.pop();
                if (node->val == x) {
                    foundX = true;
                }
                if (node->val == y) {
                    foundY = true;
                }
                if (node->left && node->right) {
                    if ((node->left->val == x && node->right->val == y) ||
                        (node->left->val == y && node->right->val == x)) {
                        return false;
                    }
                }
                if (node->left) {
                    q.push(node->left);
                }
                if (node->right) {
                    q.push(node->right);
                }
            }
            if (foundX && foundY) {
                return true;
            }
        }
        return false;
    }
};

int main() {
    Solution993 solution;

    // Test case 1
    TreeNode* root1 = new TreeNode(1);
    root1->left = new TreeNode(2);
    root1->right = new TreeNode(3);
    root1->left->left = new TreeNode(4);
    int x1 = 4, y1 = 3;
    bool result1 = solution.isCousins(root1, x1, y1);
    cout << result1 << endl; // Expected output: false

    // Test case 2
    TreeNode* root2 = new TreeNode(1);
    root2->left = new TreeNode(2);
    root2->right = new TreeNode(3);
    root2->left->right = new TreeNode(4);
    root2->right->right = new TreeNode(5);
    int x2 = 5, y2 = 4;
    bool result2 = solution.isCousins(root2, x2, y2);
    cout << result2 << endl; // Expected output: true

    // Test case 3
    TreeNode* root3 = new TreeNode(1);
    root3->left = new TreeNode(2);
    root3->right = new TreeNode(3);
    root3->left->right = new TreeNode(4);
    int x3 = 2, y3 = 3;
    bool result3 = solution.isCousins(root3, x3, y3);
    cout << result3 << endl; // Expected output: false

    return 0;
}