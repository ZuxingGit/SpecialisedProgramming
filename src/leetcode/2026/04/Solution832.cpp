#include <iostream>
#include <vector>
using namespace std;

class Solution832 {
public:
    vector<vector<int>> flipAndInvertImage(vector<vector<int>>& image) {
        int n = image.size();
        vector<vector<int>> result(n, vector<int>(n));
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                result[i][j] = 1 - image[i][n - 1 - j];
            }
        }
        return result;
    }
};

int main() {
    Solution832 solution;

    vector<vector<int>> image = {{1,1,0},{1,0,1},{0,0,0}};
    vector<vector<int>> result = solution.flipAndInvertImage(image);
    for (const auto& row : result) {
        for (int val : row) {
            cout << val << " ";
        }
        cout << endl;
    }

    vector<vector<int>> image2 = {{1,1,0,0},{1,0,0,1},{0,1,1,1},{1,0,1,0}};
    vector<vector<int>> result2 = solution.flipAndInvertImage(image2);
    for (const auto& row : result2) {
        for (int val : row) {
            cout << val << " ";
        }
        cout << endl;
    }

    return 0;
}