#include <iostream>
using namespace std;

class Solution {
public:
    bool checkPerfectNumber(int num) {
        if (num <= 1) {
            return false;
        }
        int sum = 1; // 1 is a proper divisor
        for (int i = 2; i * i <= num; ++i) {
            if (num % i == 0) {
                sum += i;
                if (i != num / i) {
                    sum += num / i;
                }
            }
        }
        return sum == num;
    }
};

int main() {
    Solution solution;

    int num1 = 28;
    cout << (solution.checkPerfectNumber(num1) ? "true" : "false") << endl; // Expected output: true

    int num2 = 7;
    cout << (solution.checkPerfectNumber(num2) ? "true" : "false") << endl; // Expected output: false

    return 0;
}