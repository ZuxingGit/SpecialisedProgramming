#include <iostream>
#include <vector>

using namespace std;

class Solution1037 {
public:
    bool isBoomerang(vector<vector<int>>& points) {
        int x1 = points[0][0], y1 = points[0][1];
        int x2 = points[1][0], y2 = points[1][1];
        int x3 = points[2][0], y3 = points[2][1];

        return (x1 - x2) * (y2 - y3) != (y1 - y2) * (x2 - x3);
    }
};

int main() {
    Solution1037 solution;

    vector<vector<int>> points1 = {{1, 1}, {2, 3}, {3, 2}};
    cout << boolalpha << solution.isBoomerang(points1) << endl; // Output: true

    vector<vector<int>> points2 = {{1, 1}, {2, 2}, {3, 3}};
    cout << boolalpha << solution.isBoomerang(points2) << endl; // Output: false

    vector<vector<int>> points3 = {{0, 0}, {1, 1}, {0, 0}};
    cout << boolalpha << solution.isBoomerang(points3) << endl; // Output: false

    return 0;
}