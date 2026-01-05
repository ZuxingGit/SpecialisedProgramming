#include <iostream>
using namespace std;

class Solution441 {
public:
    int arrangeCoins(int n) {
        long left = 0, right = n;
        while (left <= right) {
            long mid = left + (right - left) / 2;
            long curr = mid * (mid + 1) / 2;

            if (curr == n) {
                return mid;
            }
            if (curr < n) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return right;
    }
};

int main() {
    Solution441 solution;

    int n1 = 5;
    int result1 = solution.arrangeCoins(n1);
    // Expected output: 2
    cout << "Number of complete rows for " << n1 << " coins: " << result1 << endl;

    int n2 = 8;
    int result2 = solution.arrangeCoins(n2);
    // Expected output: 3
    cout << "Number of complete rows for " << n2 << " coins: " << result2 << endl;

    int n3 = 1;
    int result3 = solution.arrangeCoins(n3);
    // Expected output: 1
    cout << "Number of complete rows for " << n3 << " coins: " << result3 << endl;

    return 0;
}