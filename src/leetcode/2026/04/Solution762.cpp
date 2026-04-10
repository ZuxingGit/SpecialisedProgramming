#include <iostream>
using namespace std;

class Solution762 {
public:
    int countPrimeSetBits(int left, int right) {
        int count = 0;

        for (int i = left; i <= right; ++i) {
            int bits = __builtin_popcount(i);
            if (bits == 2 || bits == 3 || bits == 5 || bits == 7 || bits == 11 || bits == 13 || bits == 17 || bits == 19) {
                count++;
            }
        }
        return count;
    }
};

int main() {
    Solution762 solution;

    int left1 = 6, right1 = 10;
    cout << solution.countPrimeSetBits(left1, right1) << endl; // Output: 4

    int left2 = 10, right2 = 15;
    cout << solution.countPrimeSetBits(left2, right2) << endl; // Output: 5

    return 0;
}