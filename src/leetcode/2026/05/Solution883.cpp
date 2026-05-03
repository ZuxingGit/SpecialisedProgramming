#include <iostream>
#include <vector>
using namespace std;

class Solution883 {
public:
    int projectionArea(vector<vector<int>>& grid) {
        int n = grid.size();
        int xy = 0, yz = 0, zx = 0;

        for (int i = 0; i < n; ++i) {
            int maxRow = 0, maxCol = 0;
            for (int j = 0; j < n; ++j) {
                if (grid[i][j] > 0) {
                    ++xy;
                }
                maxRow = max(maxRow, grid[i][j]);
                maxCol = max(maxCol, grid[j][i]);
            }
            yz += maxRow;
            zx += maxCol;
        }

        return xy + yz + zx;
    }
};

int main() {
    Solution883 solution;

    vector<vector<int>> grid = {{1, 2}, {3, 4}};
    cout << solution.projectionArea(grid) << endl; // Output: 17

    grid = {{2}};
    cout << solution.projectionArea(grid) << endl; // Output: 5

    grid = {{1, 0}, {0, 2}};
    cout << solution.projectionArea(grid) << endl; // Output: 8
    return 0;
}