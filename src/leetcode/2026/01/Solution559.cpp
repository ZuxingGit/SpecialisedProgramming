#include <iostream>
#include <vector>
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


class Solution559 {
public:
    int maxDepth(Node* root) {
        if (root == nullptr) {
            return 0;
        }
        if (root->children.empty()) {
            return 1;
        }
        int depth = 0;
        for (Node* child : root->children) {
            depth = max(depth, maxDepth(child));
        }
        return depth + 1;
    }
};

int main() {
    Solution559 solution;

    Node* root = new Node(1);
    root->children.push_back(new Node(2));
    root->children.push_back(new Node(3));
    root->children.push_back(new Node(4));
    root->children[0]->children.push_back(new Node(5));
    root->children[0]->children.push_back(new Node(6));
    int depth = solution.maxDepth(root);
    cout << "Max Depth: " << depth << endl; // Output: Max Depth: 3
    
    return 0;
}