#include <vector>
#include <iostream>
using namespace std;

// Definition for a Node.
class Node {
public:
    int val;
    vector<Node*> children;

    Node() {}

    Node(int _val) {
        val = _val;
    }

    Node(int _val, vector<Node*> _children) {
        val = _val;
        children = _children;
    }
};


class Solution {
public:
    vector<int> postorder(Node* root) {
        vector<int> res;
        if (root == nullptr) {
            return res;
        }
        for (Node* child : root->children) {
            vector<int> childRes = postorder(child);
            res.insert(res.end(), childRes.begin(), childRes.end());
        }
        res.push_back(root->val);
        return res;
    }
};

int main() {
    // Example usage:
    Node* root = new Node(1);
    root->children.push_back(new Node(3));
    root->children.push_back(new Node(2));
    root->children.push_back(new Node(4));
    root->children[0]->children.push_back(new Node(5));
    root->children[0]->children.push_back(new Node(6));

    Solution solution;
    vector<int> result = solution.postorder(root);
    for (int val : result) {
        cout << val << " ";
    }
    cout << endl;

    // Clean up memory
    delete root->children[0]->children[0];
    delete root->children[0]->children[1];
    delete root->children[0];
    delete root->children[1];
    delete root->children[2];

    return 0;
}