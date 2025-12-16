#include <iostream>

class Solution326
{
public:
    bool isPowerOfThree(int n)
    {
        if (n < 1)
        {
            return false;
        }
        while (n % 3 == 0)
        {
            n /= 3;
        }
        return n == 1;
    }
};

int main()
{
    Solution326 solution;

    std::cout << solution.isPowerOfThree(27) << std::endl; // true
    std::cout << solution.isPowerOfThree(0) << std::endl;  // false
    std::cout << solution.isPowerOfThree(9) << std::endl;  // true
    std::cout << solution.isPowerOfThree(45) << std::endl; // false
    return 0;
}