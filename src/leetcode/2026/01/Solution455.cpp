#include <vector>
#include <iostream>
using namespace std;

class Solution455 {
public:
    int findContentChildren(vector<int>& g, vector<int>& s) {
        sort(g.begin(), g.end());
        sort(s.begin(), s.end());
        int childIndex = 0;
        int cookieIndex = 0;

        while (childIndex < g.size() && cookieIndex < s.size()) {
            if (s[cookieIndex] >= g[childIndex]) {
                childIndex++;
            }
            cookieIndex++;
        }

        return childIndex;
    }
};

int main() {
    Solution455 solution;

    vector<int> g1 = {1,2,3};
    vector<int> s1 = {1,1};
    int result1 = solution.findContentChildren(g1, s1);
    // Expected output: 1
    cout << "Number of content children: " << result1 << endl;

    vector<int> g2 = {1,2};
    vector<int> s2 = {1,2,3};
    int result2 = solution.findContentChildren(g2, s2);
    // Expected output: 2
    cout << "Number of content children: " << result2 << endl;

    return 0;
}