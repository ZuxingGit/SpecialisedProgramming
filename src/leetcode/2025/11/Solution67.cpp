#include <string>
#include <iostream>
using namespace std;

class Solution67
{
public:
    string addBinary(string a, string b)
    {
        string result;
        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;

        while (i >= 0 || j >= 0 || carry)
        {
            int sum = carry;
            if (i >= 0)
            {
                sum += a[i] - '0';
                i--;
            }
            if (j >= 0)
            {
                sum += b[j] - '0';
                j--;
            }
            result.push_back((sum % 2) + '0');
            carry = sum / 2;
        }

        reverse(result.begin(), result.end());
        return result;
    }
};

int main()
{
    Solution67 solution;
    string a1 = "11";
    string b1 = "1";
    string result1 = solution.addBinary(a1, b1);
    cout << "Result: " << result1 << endl;
    // Expected Output: "100"

    string a2 = "1010";
    string b2 = "1011";
    string result2 = solution.addBinary(a2, b2);
    cout << "Result: " << result2 << endl;
    // Expected Output: "10101"

    return 0;
}