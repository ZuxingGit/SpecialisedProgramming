#include <vector>
#include <iostream>
using namespace std;

class Solution {
public:
    vector<vector<int>> floodFill(vector<vector<int>>& image, int sr, int sc, int color) {
        int originalColor = image[sr][sc];
        if (originalColor == color) return image;
        fill(image, sr, sc, originalColor, color);
        return image;
    }

private:
    void fill(vector<vector<int>>& image, int r, int c, int originalColor, int color) {
        if (r < 0 || r >= image.size() || c < 0 || c >= image[0].size() || image[r][c] != originalColor) return;
        image[r][c] = color;
        fill(image, r + 1, c, originalColor, color);
        fill(image, r - 1, c, originalColor, color);
        fill(image, r, c + 1, originalColor, color);
        fill(image, r, c - 1, originalColor, color);

    }
};

int main() {
    Solution solution;

    vector<vector<int>> image = {{1,1,1},{1,1,0},{1,0,1}};
    int sr = 1, sc = 1, color = 2;
    vector<vector<int>> result = solution.floodFill(image, sr, sc, color);
    // Output: [[2,2,2],[2,2,0],[2,0,1]]
    for (const auto& row : result) {
        for (int pixel : row) {
            cout << pixel << " ";
        }
        cout << endl;
    }

    vector<vector<int>> image2 = {{0,0,0},{0,0,0}};
    sr = 0, sc = 0, color = 0;
    result = solution.floodFill(image2, sr, sc, color);
    // Output: [[0,0,0],[0,0,0]]
    for (const auto& row : result) {
        for (int pixel : row) {
            cout << pixel << " ";
        }
        cout << endl;    
    }

    return 0;
}