#include <iostream>
using namespace std;

class Solution231
{
public:
    bool isPowerOfTwo(int n)
    {
        return n > 0 && (n & (n - 1)) == 0;
    }
};

int main()
{
    Solution231 sol;

    int n1 = 1;
    bool r1 = sol.isPowerOfTwo(n1);
    cout << r1 << endl;

    int n2 = 16;
    bool r2 = sol.isPowerOfTwo(n2);
    cout << r2 << endl;

    int n3 = 3;
    bool r3 = sol.isPowerOfTwo(n3);
    cout << r3 << endl;

    return 0;
}