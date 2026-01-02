#include <string>
#include <algorithm>
#include <iostream>
using namespace std;

class Solution415 {
public:
    string addStrings(string num1, string num2) {
        string result;
        int carry = 0;
        int i = num1.size() - 1, j = num2.size() - 1;

        while (i >= 0 || j >= 0 || carry) {
            int digit1 = (i >= 0) ? num1[i--] - '0' : 0;
            int digit2 = (j >= 0) ? num2[j--] - '0' : 0;
            int sum = digit1 + digit2 + carry;
            result.push_back((sum % 10) + '0');
            carry = sum / 10;
        }

        reverse(result.begin(), result.end());
        return result;
    }
};

int main() {
    Solution415 solution;

    string num1 = "123";
    string num2 = "456";
    string result = solution.addStrings(num1, num2);
    // Expected output: "579"
    cout << "Result: " << result << endl;

    return 0;
}