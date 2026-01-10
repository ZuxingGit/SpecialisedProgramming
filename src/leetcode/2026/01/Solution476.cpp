#include <iostream>
using namespace std;

class Solution476 {
public:
    int findComplement(int num) {
        unsigned int mask = ~0;
        while (mask & num) {
            mask <<= 1;
        }
        return ~num & ~mask;
    }
};

int main() {
    Solution476 solution;

    int num1 = 5;
    cout << "Complement of " << num1 << " is: " 
         << solution.findComplement(num1) << endl;
    // Expected output: 2

    int num2 = 1;
    cout << "Complement of " << num2 << " is: " 
         << solution.findComplement(num2) << endl;
    // Expected output: 0

    return 0;
}