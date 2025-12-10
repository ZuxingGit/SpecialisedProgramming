#include <iostream>
using namespace std;

class Solution263
{
public:
    bool isUgly(int n)
    {
        if (n <= 0)
        {
            return false;
        }
        while (n % 2 == 0)
        {
            n /= 2;
        }
        while (n % 3 == 0)
        {
            n /= 3;
        }
        while (n % 5 == 0)
        {
            n /= 5;
        }
        return n == 1;
    }
};

int main()
{
    Solution263 sol;

    int n1 = 6;
    bool r1 = sol.isUgly(n1);
    cout << r1 << endl; // Output: true

    int n2 = 8;
    bool r2 = sol.isUgly(n2);
    cout << r2 << endl; // Output: true

    int n3 = 14;
    bool r3 = sol.isUgly(n3);
    cout << r3 << endl; // Output: false

    int n4 = 1;
    bool r4 = sol.isUgly(n4);
    cout << r4 << endl; // Output: true

    return 0;
}