#include <string>
#include <iostream>
using namespace std;

class Solution521 {
public:
    int findLUSlength(string a, string b) {
        if (a == b) {
            return -1;
        } else {
            return max(a.size(), b.size());
        }
    }
};

int main() {
    Solution521 solution;

    string a1 = "aba";
    string b1 = "cdc";
    cout << solution.findLUSlength(a1, b1) << endl; // Expected output: 3

    string a2 = "aaa";
    string b2 = "aaa";
    cout << solution.findLUSlength(a2, b2) << endl; // Expected output: -1

    return 0;
}