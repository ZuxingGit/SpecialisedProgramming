#include <iostream>
#include <string>
using namespace std;

class Solution405 {
public:
    string toHex(int num) {
        if (num == 0) return "0";
        const char* hexChars = "0123456789abcdef";
        unsigned int n = static_cast<unsigned int>(num);
        string result;
        while (n > 0) {
            result = hexChars[n % 16] + result;
            n /= 16;
        }
        return result;
    }
};

int main() {
    Solution405 sol;
    // Example usage:
    int num1 = 26;
    string hexStr1 = sol.toHex(num1);
    // hexStr should be "1a"
    cout << "Hexadecimal representation of " << num1 << " is: " << hexStr1 << endl;

    int num2 = -1;
    string hexStr2 = sol.toHex(num2);
    // hexStr should be "ffffffff"
    cout << "Hexadecimal representation of " << num2 << " is: " << hexStr2 << endl;

    return 0;
}