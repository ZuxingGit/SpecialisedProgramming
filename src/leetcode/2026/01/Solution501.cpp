#include <vector>
using namespace std;

struct TreeNode {
    int val;
    TreeNode *left;
    TreeNode *right;
    TreeNode() : val(0), left(nullptr), right(nullptr) {}
    TreeNode(int x) : val(x), left(nullptr), right(nullptr) {}
    TreeNode(int x, TreeNode *left, TreeNode *right) : val(x), left(left), right(right) {}
};

class Solution501 {
public:
    vector<int> findMode(TreeNode* root) {
        vector<int> modes;
        if (!root) return modes;

        int currentVal = 0;
        int currentCount = 0;
        int maxCount = 0;

        TreeNode* prev = nullptr;
        TreeNode* curr = root;
        TreeNode* pre = nullptr;

        while (curr) {
            if (!curr->left) {
                // Visit current node
                if (prev && prev->val == curr->val) {
                    currentCount++;
                } else {
                    currentVal = curr->val;
                    currentCount = 1;
                }

                if (currentCount > maxCount) {
                    maxCount = currentCount;
                    modes.clear();
                    modes.push_back(currentVal);
                } else if (currentCount == maxCount) {
                    modes.push_back(currentVal);
                }

                prev = curr;
                curr = curr->right;
            } else {
                pre = curr->left;
                while (pre->right && pre->right != curr) {
                    pre = pre->right;
                }

                if (!pre->right) {
                    pre->right = curr;
                    curr = curr->left;
                } else {
                    pre->right = nullptr;

                    // Visit current node
                    if (prev && prev->val == curr->val) {
                        currentCount++;
                    } else {
                        currentVal = curr->val;
                        currentCount = 1;
                    }

                    if (currentCount > maxCount) {
                        maxCount = currentCount;
                        modes.clear();
                        modes.push_back(currentVal);
                    } else if (currentCount == maxCount) {
                        modes.push_back(currentVal);
                    }

                    prev = curr;
                    curr = curr->right;
                }
            }
        }

        return modes;
    }
};

int main() {
    Solution501 sol;

    // Example usage:
    TreeNode* root1 = new TreeNode(1);
    root1->right = new TreeNode(2);
    root1->right->left = new TreeNode(2);

    vector<int> modes = sol.findMode(root1);
    // Expected output: [2]
    for (int mode : modes) {
        printf("%d ", mode);
    }
    printf("\n");

    TreeNode* root2 = new TreeNode(0);
    modes = sol.findMode(root2);
    // Expected output: [0]
    for (int mode : modes) {
        printf("%d ", mode);
    }
    printf("\n");

    return 0;
}