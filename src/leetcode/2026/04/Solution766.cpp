#include <vector>

using namespace std;

class Solution766 {
public:
    bool isToeplitzMatrix(vector<vector<int>>& matrix) {
        int m = matrix.size();
        int n = matrix[0].size();
        for (int i = 0; i < m - 1; ++i) {
            for (int j = 0; j < n - 1; ++j) {
                if (matrix[i][j] != matrix[i + 1][j + 1]) {
                    return false;
                }
            }
        }
        return true;
    }
};

int main() {
    Solution766 solution;

    vector<vector<int>> matrix1 = {
        {1, 2, 3, 4},
        {5, 1, 2, 3},
        {9, 5, 1, 2}
    };
    bool result1 = solution.isToeplitzMatrix(matrix1);
    printf("Result 1: %s\n", result1 ? "true" : "false");

     vector<vector<int>> matrix2 = {
        {1, 2},
        {2, 2}
    };
    bool result2 = solution.isToeplitzMatrix(matrix2);
    printf("Result 2: %s\n", result2 ? "true" : "false");
    
    return 0;
}