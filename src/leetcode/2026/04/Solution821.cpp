#include <iostream>
#include <vector>
#include <string>

using namespace std;

class Solution821 {
public:
    vector<int> shortestToChar(string s, char c) {
        int n = s.size();
        vector<int> result(n, 0); // Initialize with a large number
        int prev = -n; // Previous occurrence of c, initialized to a large negative number

        // Forward pass to find the distance to the previous occurrence of c
        for (int i = 0; i < n; ++i) {
            if (s[i] == c) {
                prev = i;
                continue;
            }
            result[i] = i - prev;
        }

        prev = 2 * n; // Next occurrence of c, initialized to a large positive number

        // Backward pass to find the distance to the next occurrence of c
        for (int i = n - 1; i >= 0; --i) {
            if (s[i] == c) {
                prev = i;
                continue;
            }
            result[i] = min(result[i], prev - i);
        }

        return result;
    }
};

int main() {
    Solution821 solution;

    string s = "loveleetcode";
    char c = 'e';
    vector<int> result = solution.shortestToChar(s, c);
    // Expected output: [3,2,1,0,1,0,0,1,2,2,1,0]
    for (int dist : result) {
        cout << dist << " ";
    }
    cout << endl;

    s = "aaab";
    c = 'b';
    result = solution.shortestToChar(s, c);
    // Expected output: [3,2,1,0]
    for (int dist : result) {
        cout << dist << " ";
    }
    cout << endl;

    return 0;
}