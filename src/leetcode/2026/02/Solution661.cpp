#include <vector>
#include <iostream>
using namespace std;

class Solution661 {
public:
    vector<vector<int>> imageSmoother(vector<vector<int>>& img) {
        int m = img.size();
        int n = img[0].size();
        vector<vector<int>> result(m, vector<int>(n, 0));

        for (int i = 0; i < m; ++i) {
            for (int j = 0; j < n; ++j) {
                int sum = 0;
                int count = 0;

                for (int x = max(0, i - 1); x <= min(m - 1, i + 1); ++x) {
                    for (int y = max(0, j - 1); y <= min(n - 1, j + 1); ++y) {
                        sum += img[x][y];
                        count++;
                    }
                }

                result[i][j] = sum / count;
            }
        }

        return result;
    }
};

int main() {
    Solution661 solution;

    vector<vector<int>> img = {
        {1, 1, 1},
        {1, 0, 1},
        {1, 1, 1}
    };
    vector<vector<int>> result = solution.imageSmoother(img);
    // Output: [[0, 0, 0], [0, 0, 0], [0, 0, 0]]
    for (const auto& row : result) {
        for (int val : row) {
            cout << val << " ";
        }
        cout << endl;
    }

    vector<vector<int>> img2 = {
        {100, 200, 100},
        {200, 50, 200},
        {100, 200, 100}
    };
    result = solution.imageSmoother(img2);
    // Output: [[137, 141, 137], [141, 138, 141], [137, 141, 137]]
    for (const auto& row : result) {
        for (int val : row) {
            cout << val << " ";
        }
        cout << endl;
    }

    return 0;
}