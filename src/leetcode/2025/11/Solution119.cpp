#include <vector>
#include <iostream>
using namespace std;

class Solution
{
public:
    vector<int> getRow(int rowIndex)
    {
        vector<int> row(rowIndex + 1, 1);
        for (int i = 1; i < rowIndex; ++i)
        {
            for (int j = i; j > 0; --j)
            {
                row[j] += row[j - 1];
            }
        }
        return row;
    }
};

int main()
{
    Solution solution;

    // Example 1
    int rowIndex = 3;
    vector<int> result = solution.getRow(rowIndex);
    // Expected Output: [1, 3, 3, 1]
    for (int val : result)
    {
        cout << val << " ";
    }
    cout << endl;

    // Example 2
    rowIndex = 0;
    result = solution.getRow(rowIndex);
    // Expected Output: [1]
    for (int val : result)
    {
        cout << val << " ";
    }
    cout << endl;

    // Example 3
    rowIndex = 1;
    result = solution.getRow(rowIndex);
    // Expected Output: [1, 1]
    for (int val : result)
    {
        cout << val << " ";
    }
    cout << endl;

    return 0;
}