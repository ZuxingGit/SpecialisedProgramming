#include <vector>
#include <cmath>
#include <algorithm>
#include <iostream>

using namespace std;

class Solution812 {
public:
    double largestTriangleArea(vector<vector<int>>& points) {
        double maxArea = 0.0;

        for (int i = 0; i < points.size(); i++) {
            for (int j = i + 1; j < points.size(); j++) {
                for (int k = j + 1; k < points.size(); k++) {
                    double area = calculateArea(points[i], points[j], points[k]);
                    maxArea = max(maxArea, area);
                }
            }
        }

        return maxArea;
    }

private:
    double calculateArea(vector<int>& p1, vector<int>& p2, vector<int>& p3) {
        return 0.5 * abs(p1[0] * (p2[1] - p3[1]) + p2[0] * (p3[1] - p1[1]) + p3[0] * (p1[1] - p2[1]));
    }
};

int main() {
    Solution812 solution;

    vector<vector<int>> points1 = { {0, 0}, {0, 1}, {1, 0} };
    double result1 = solution.largestTriangleArea(points1);
    cout << result1 << endl; // Output: 0.5

    vector<vector<int>> points2 = { {0, 0}, {0, 2}, {2, 0} };
    double result2 = solution.largestTriangleArea(points2);
    cout << result2 << endl; // Output: 2.0
}