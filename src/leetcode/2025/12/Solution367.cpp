#include <iostream>
using namespace std;

class Solution367 {
public:
    bool isPerfectSquare(int num) {
        if (num < 2) {
            return true;
        }

        long left = 2, right = num / 2;

        while (left <= right) {
            long mid = left + (right - left) / 2;
            long squared = mid * mid;

            if (squared == num) {
                return true;
            } else if (squared < num) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return false;
    }
};

int main() {
    Solution367 solution;

    int testNum1 = 16;
    bool result1 = solution.isPerfectSquare(testNum1);
    std::cout << testNum1 << " is a perfect square: " << (result1 ? "true" : "false") << std::endl;
    // Expected output: true

    int testNum2 = 14;
    bool result2 = solution.isPerfectSquare(testNum2);
    std::cout << testNum2 << " is a perfect square: " << (result2 ? "true" : "false") << std::endl;
    // Expected output: false

    return 0;
}