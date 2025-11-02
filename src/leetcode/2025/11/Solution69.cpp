#include <iostream>
using namespace std;

class Solution
{
public:
    int mySqrt(int x)
    {
        if (x < 2)
            return x;
        int low = 2, high = x / 2;
        while (low <= high)
        {
            int mid = low + (high - low) / 2;
            long square = (long)mid * mid;
            if (square == x)
            {
                return mid;
            }
            else if (square < x)
            {
                low = mid + 1;
            }
            else
            {
                high = mid - 1;
            }
        }
        return high; // Return the floor of the square root
    }
};

int main()
{
    Solution solution;
    int x1 = 4;
    int result1 = solution.mySqrt(x1);
    cout << "Result: " << result1 << endl;
    // Expected Output: 2

    int x2 = 8;
    int result2 = solution.mySqrt(x2);
    cout << "Result: " << result2 << endl;
    // Expected Output: 2

    int x3 = 2;
    int result3 = solution.mySqrt(x3);
    cout << "Result: " << result3 << endl;
    // Expected Output: 1

    int x4 = 2147395599;
    int result4 = solution.mySqrt(x4);
    cout << "Result: " << result4 << endl;
    // Expected Output: 46339
    return 0;
}