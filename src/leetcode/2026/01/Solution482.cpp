#include <string>
#include <iostream>
using namespace std;

class Solution482 {
public:
    string licenseKeyFormatting(string s, int k) {
        string result;
        int count = 0;

        for (int i = s.length() - 1; i >= 0; --i) {
            if (s[i] != '-') {
                if (count == k) {
                    result.push_back('-');
                    count = 0;
                }
                result.push_back(toupper(s[i]));
                count++;
            }
        }

        reverse(result.begin(), result.end());
        return result;
    }
};

int main() {
    Solution482 solution;

    string s1 = "5F3Z-2e-9-w";
    int k1 = 4;
    cout << "Formatted license key: " 
         << solution.licenseKeyFormatting(s1, k1) << endl;
    // Expected output: "5F3Z-2E9W"

    string s2 = "2-5g-3-J";
    int k2 = 2;
    cout << "Formatted license key: " 
         << solution.licenseKeyFormatting(s2, k2) << endl;
    // Expected output: "2-5G-3J"

    return 0;
}