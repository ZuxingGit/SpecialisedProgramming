#include <vector>
#include <iostream>
using namespace std;

class Solution892 {
public:
    int surfaceArea(vector<vector<int>>& grid) {
        int surfaceArea = 0;
        int rows = grid.size();
        int cols = grid[0].size();

        for (int i = 0; i < rows; ++i) {
            for (int j = 0; j < cols; ++j) {
                if (grid[i][j] > 0) {
                    surfaceArea += 2; // Top and bottom faces
                    surfaceArea += 4 * grid[i][j]; // Front, back, left, right faces

                    if (i > 0) {
                        surfaceArea -= 2 * min(grid[i][j], grid[i - 1][j]);
                    }
                    if (j > 0) {
                        surfaceArea -= 2 * min(grid[i][j], grid[i][j - 1]);
                    }
                }
            }
        }
        return surfaceArea;
    }
};

int main() {
    Solution892 solution;

    vector<vector<int>> grid = {{1, 2}, {3, 4}};
    int result = solution.surfaceArea(grid);
    cout << result << endl; // Output: 34

    grid = {{1, 0}, {0, 2}};
    result = solution.surfaceArea(grid);
    cout << result << endl; // Output: 16

    grid = {{1, 1, 1}, {1, 0, 1}, {1, 1, 1}};
    result = solution.surfaceArea(grid);
    cout << result << endl; // Output: 32

    grid = {{2, 2, 2}, {2, 1, 2}, {2, 2, 2}};
    result = solution.surfaceArea(grid);
    cout << result << endl; // Output: 46

    return 0;
}