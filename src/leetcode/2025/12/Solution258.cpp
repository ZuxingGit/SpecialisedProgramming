#include <iostream>
using namespace std;

class Solution258
{
public:
    int addDigits(int num)
    {
        if (num == 0)
        {
            return 0;
        }
        else if (num % 9 == 0)
        {
            return 9;
        }
        else
        {
            return num % 9;
        }
    }
};

int main()
{
    Solution258 sol;

    int num1 = 38;
    int res1 = sol.addDigits(num1);
    cout << res1 << endl; // Output: 2

    int num2 = 0;
    int res2 = sol.addDigits(num2);
    cout << res2 << endl; // Output: 0

    int num3 = 12345;
    int res3 = sol.addDigits(num3);
    cout << res3 << endl; // Output: 6

    return 0;
}