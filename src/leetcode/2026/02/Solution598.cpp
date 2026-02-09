#include <iostream>
#include <vector>

using namespace std;

class Solution598 {
public:
    int maxCount(int m, int n, vector<vector<int>>& ops) {
        int minRow = m, minCol = n;
        for (const auto& op : ops) {
            minRow = min(minRow, op[0]);
            minCol = min(minCol, op[1]);
        }
        return minRow * minCol;
    }
};

int main() {
    Solution598 solution;
    vector<vector<int>> ops = {{2, 2}, {3, 3}};
    int result = solution.maxCount(4, 4, ops);
    cout << result << endl; // Output: 4
    return 0;
}