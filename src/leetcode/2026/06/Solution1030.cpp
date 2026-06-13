#include <vector>
#include <iostream>
using namespace std;

class Solution1030 {
public:
    vector<vector<int>> allCellsDistOrder(int rows, int cols, int rCenter, int cCenter) {
        vector<vector<int>> result;
        for (int i = 0; i < rows; ++i) {
            for (int j = 0; j < cols; ++j) {
                result.push_back({i, j});
            }
        }
        sort(result.begin(), result.end(), [rCenter, cCenter](const vector<int>& a, const vector<int>& b) {
            int distA = abs(a[0] - rCenter) + abs(a[1] - cCenter);
            int distB = abs(b[0] - rCenter) + abs(b[1] - cCenter);
            return distA < distB;
        });
        return result;
    }
};

int main() {
    Solution1030 solution;

    vector<vector<int>> result = solution.allCellsDistOrder(2, 3, 1, 2);
    for (const auto& cell : result) {
        cout << "[" << cell[0] << ", " << cell[1] << "] ";
    }
    cout << endl; // Output: [[1,2], [0,2], [1,1], [0,1], [1,0], [0,0]]

    vector<vector<int>> result2 = solution.allCellsDistOrder(1, 2, 0, 0);
    for (const auto& cell : result2) {
        cout << "[" << cell[0] << ", " << cell[1] << "] ";
    }
    cout << endl; // Output: [[0,0], [0,1]]

    vector<vector<int>> result3 = solution.allCellsDistOrder(2, 2, 0, 1);
    for (const auto& cell : result3) {
        cout << "[" << cell[0] << ", " << cell[1] << "] ";
    }
    cout << endl; // Output: [[0,1], [0,0], [1,1], [1,0]]

    return 0;
}