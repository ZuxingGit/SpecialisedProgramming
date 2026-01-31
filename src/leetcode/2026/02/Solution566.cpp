#include <vector>
#include <iostream>
using namespace std;

class Solution566 {
public:
    vector<vector<int>> matrixReshape(vector<vector<int>>& mat, int r, int c) {
        int originalRows = mat.size();
        int originalCols = mat[0].size();
        
        if (originalRows * originalCols != r * c) {
            return mat; // Return original matrix if reshape is not possible
        }
        
        vector<vector<int>> reshapedMatrix(r, vector<int>(c));
        for (int i = 0; i < originalRows * originalCols; ++i) {
            reshapedMatrix[i / c][i % c] = mat[i / originalCols][i % originalCols];
        }
        
        return reshapedMatrix;
    }
};

int main() {
    // Example usage:
    Solution566 solution;

    vector<vector<int>> mat1 = {{1, 2}, {3, 4}};
    int r1 = 1, c1 = 4;
    vector<vector<int>> reshaped = solution.matrixReshape(mat1, r1, c1);
    // reshaped should be {{1, 2, 3, 4}}
    for (vector<int> row : reshaped) {
        for (int val : row) {
            cout << val << " ";
        }
        cout << endl;
    }

    vector<vector<int>> mat2 = {{1, 2}, {3, 4}};
    int r2 = 2, c2 = 4;
    reshaped = solution.matrixReshape(mat2, r2, c2);
    // reshaped should be {{1, 2}, {3, 4}} (reshape not possible)
    for (vector<int> row : reshaped) {
        for (int val : row) {
            cout << val << " ";
        }
        cout << endl;
    }
    return 0;
}