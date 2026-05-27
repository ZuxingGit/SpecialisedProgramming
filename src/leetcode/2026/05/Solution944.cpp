#include <iostream>
#include <vector>
#include <string>
using namespace std;

class Solution944 {
public:
    int minDeletionSize(vector<string>& strs) {
        int count = 0;
        int n = strs.size(); //number of strings
        int m = strs[0].size(); //length of each string

        for (int j = 0; j < m; j++) {
            for (int i = 1; i < n; i++) {
                if (strs[i][j] < strs[i - 1][j]) {
                    count++;
                    break;
                }
            }
        }

        return count;
    }
};

int main() {
    Solution944 solution;

    vector<string> strs1 = {"cba", "daf", "ghi"};
    vector<string> strs2 = {"a", "b"};
    vector<string> strs3 = {"zyx", "wvu", "tsr"};

    cout << solution.minDeletionSize(strs1) << endl; // Output: 1
    cout << solution.minDeletionSize(strs2) << endl; // Output: 0
    cout << solution.minDeletionSize(strs3) << endl; // Output: 3

    return 0;
}