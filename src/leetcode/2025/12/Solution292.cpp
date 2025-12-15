#include <iostream>
using namespace std;

class Solution292
{
public:
    bool canWinNim(int n)
    {
        return n % 4 != 0;
    }
};

int main()
{
    Solution292 solution;

    int n1 = 4;
    cout << (solution.canWinNim(n1) ? "true" : "false") << endl;
    // Expected output: false

    int n2 = 1;
    cout << (solution.canWinNim(n2) ? "true" : "false") << endl;
    // Expected output: true

    int n3 = 2;
    cout << (solution.canWinNim(n3) ? "true" : "false") << endl;
    // Expected output: true

    int n4 = 7;
    cout << (solution.canWinNim(n4) ? "true" : "false") << endl;
    // Expected output: true

    return 0;
}