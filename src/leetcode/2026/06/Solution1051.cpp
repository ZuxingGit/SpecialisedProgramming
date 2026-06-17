#include <vector>
#include <iostream>

using namespace std;

class Solution1051 {
public:
    int heightChecker(vector<int>& heights) {
        vector<int> expected(heights);
        sort(expected.begin(), expected.end());
        int count = 0;
        for (int i = 0; i < heights.size(); i++) {
            if (heights[i] != expected[i]) {
                count++;
            }
        }
        return count;
    }
};

int main() {
    Solution1051 solution;

    vector<int> heights1 = {1, 1, 4, 2, 1, 3};
    int result1 = solution.heightChecker(heights1);
    cout << result1 << endl; // Output: 3

    vector<int> heights2 = {5, 1, 2, 3, 4};
    int result2 = solution.heightChecker(heights2);
    cout << result2 << endl; // Output: 5

    vector<int> heights3 = {1, 2, 3, 4, 5};
    int result3 = solution.heightChecker(heights3);
    cout << result3 << endl; // Output: 0

    return 0;
}