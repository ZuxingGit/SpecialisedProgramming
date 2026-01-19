#include <string>
#include <iostream>
using namespace std;

class Solution504 {
public:
    string convertToBase7(int num) {
        if (num == 0) return "0";

        bool isNegative = num < 0;
        num = abs(num);
        string result;

        while (num > 0) {
            int remainder = num % 7;
            result = to_string(remainder) + result;
            num /= 7;
        }

        if (isNegative) {
            result = "-" + result;
        }

        return result;
    }
};

int main() {
    Solution504 solution;

    int number1 = 100;
    string base7_1 = solution.convertToBase7(number1);
    // Expected output: "202"
    cout << "Base 7 of " << number1 << " is: " << base7_1 << endl;

    int number2 = -7;
    string base7_2 = solution.convertToBase7(number2);
    // Expected output: "-10"
    cout << "Base 7 of " << number2 << " is: " << base7_2 << endl;

    return 0;
}