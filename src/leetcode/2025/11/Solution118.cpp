#include <iostream>
#include <vector>
using namespace std;

class Solution
{
public:
    vector<vector<int>> generate(int numRows)
    {
        vector<vector<int>> triangle;
        for (int row = 0; row < numRows; ++row)
        {
            triangle.push_back(vector<int>(row + 1, 1));
            for (int col = 1; col < row; ++col)
            {
                triangle[row][col] = triangle[row - 1][col - 1] + triangle[row - 1][col];
            }
        }
        return triangle;
    }
};

int main()
{
    Solution solution;
    int numRows = 5;
    vector<vector<int>> result = solution.generate(numRows);
    // Expected Output:
    // [
    //      [1],
    //     [1,1],
    //    [1,2,1],
    //   [1,3,3,1],
    //  [1,4,6,4,1]
    // ]
    for (const auto &row : result)
    {
        for (int val : row)
        {
            cout << val << " ";
        }
        cout << endl;
    }
    return 0;
}