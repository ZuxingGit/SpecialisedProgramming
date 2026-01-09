#include <vector>
#include <iostream>
using namespace std;

class Solution463 {
public:
    int islandPerimeter(vector<vector<int>>& grid) {
        int perimeter = 0;
        int rows = grid.size();
        int cols = grid[0].size();
        
        for (int r = 0; r < rows; ++r) {
            for (int c = 0; c < cols; ++c) {
                if (grid[r][c] == 1) {
                    perimeter += 4;
                    if (r > 0 && grid[r - 1][c] == 1) perimeter -= 2;
                    if (c > 0 && grid[r][c - 1] == 1) perimeter -= 2;
                }
            }
        }
        
        return perimeter;
    }
};

int main() {
    Solution463 solution;

    vector<vector<int>> grid1 = {
        {0, 1, 0, 0},
        {1, 1, 1, 0},
        {0, 1, 0, 0},
        {1, 1, 0, 0}
    };
    cout << "Island Perimeter: " << solution.islandPerimeter(grid1) << endl;
    // Expected output: 16

    vector<vector<int>> grid2 = {
        {1}
    };
    cout << "Island Perimeter: " << solution.islandPerimeter(grid2) << endl;
    // Expected output: 4

    vector<vector<int>> grid3 = {
        {1, 0}
    };
    cout << "Island Perimeter: " << solution.islandPerimeter(grid3) << endl;
    // Expected output: 4

    return 0;
}