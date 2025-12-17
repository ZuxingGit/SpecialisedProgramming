#include <iostream>

class Solution342
{
public:
    bool isPowerOfFour(int n)
    {
        if (n < 1)
        {
            return false;
        }
        while (n % 4 == 0)
        {
            n /= 4;
        }
        return n == 1;
    }
};

int main()
{
    Solution342 solution;

    std::cout << solution.isPowerOfFour(16) << std::endl; // true
    std::cout << solution.isPowerOfFour(5) << std::endl;  // false
    std::cout << solution.isPowerOfFour(1) << std::endl;  // true
    std::cout << solution.isPowerOfFour(64) << std::endl; // true
    return 0;
}